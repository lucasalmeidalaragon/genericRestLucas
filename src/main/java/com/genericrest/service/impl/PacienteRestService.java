/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.PacienteDAO;
import com.genericrest.model.Paciente;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.PacienteService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Almeida
 */
@ManagedBean
@Path("/paciente")
public class PacienteRestService  extends GenericCRUDRestService<Paciente> implements PacienteService{

    private static final Logger LOG = LoggerFactory.getLogger(PacienteRestService.class);
    
    public PacienteRestService() {
        super(Paciente.class);
    }

    @Inject
    private PacienteDAO pacienteDAO;

 
    @Override
    public GenericEntity listToGenericEntity(List<Paciente> list) {
        return new GenericEntity<List<Paciente>>(list){};
    }
    
    @Override
    public DAO getDao() {
        return pacienteDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}  
    
