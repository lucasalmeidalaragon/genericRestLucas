/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Almeida
 */
@Entity
@Table(name = "pacientes")
@XmlRootElement
public class Paciente extends AbstractEntity{
    
    @Column(length = 255, nullable = false)
    private String nome;
      
    @Column(length = 255, nullable = false, updatable = false)
    private Zona zona;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
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
        final Paciente other = (Paciente) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nome=" + nome + ", zona=" + zona + '}';
    }

    public Paciente() {
    }

    @Override
    public void updateParameters(Object entity) {
        final Paciente paciente = (Paciente) entity;
        this.nome = paciente.getNome(); 
        this.zona = paciente.getZona();
    }
    
}


