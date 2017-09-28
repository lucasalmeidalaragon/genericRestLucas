/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Almeida
 */
@Entity
@Table(name = "chamados")
@XmlRootElement
public class Chamado extends AbstractEntity{
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @OneToMany
    private List<Paciente> pacientes;
    
    @Column(length = 255, nullable = false)
    private String detalhes;

    @Override
    public void updateParameters(Object entity) {
        final Chamado chamado = (Chamado) entity;
        
        this.data = chamado.getData();
        this.pacientes = (List<Paciente>) chamado.getPaciente();
        this.detalhes = chamado.getDetalhes();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.pacientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chamado other = (Chamado) obj;
        if (!Objects.equals(this.pacientes, other.pacientes)) {
            return false;
        }
        return true;
    } 
      

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public Paciente getPaciente(){
        return (Paciente) pacientes;
    }
    

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "Chamado{" + "data=" + data + ", pacientes=" + pacientes + ", detalhes=" + detalhes + '}';
    }

    
    public List<Paciente> getPacientes(){
       return pacientes; 
    }
    
}