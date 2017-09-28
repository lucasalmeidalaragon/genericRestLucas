/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ZonaDAO;
import com.genericrest.model.Zona;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.ZonaService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Almeida
 */
@ManagedBean
@Path("/zona")
public class ZonaRestService extends GenericCRUDRestService<Zona> implements ZonaService{

    private static final Logger LOG = LoggerFactory.getLogger(ZonaRestService.class);
    
    @Inject
    private ZonaDAO zonaDAO;
    
    public ZonaRestService() {
        super(Zona.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Zona> list) {
        return new GenericEntity<List<Zona>>(list){};
    }

    @Override
    public DAO getDao() {
        return zonaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
}
