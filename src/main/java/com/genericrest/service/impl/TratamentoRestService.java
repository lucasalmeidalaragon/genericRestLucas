/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.TratamentoDAO;
import com.genericrest.model.Tratamento;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.TratamentoService;
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
@Path("/tratamento")
public class TratamentoRestService extends GenericCRUDRestService<Tratamento> implements TratamentoService{

    private static final Logger LOG = LoggerFactory.getLogger(TratamentoRestService.class); 
    
    public TratamentoRestService() {
        super(Tratamento.class);
    }
    

    @Inject
    private TratamentoDAO tratamentoDAO;
    
    
    @Override
    public GenericEntity listToGenericEntity(List<Tratamento> list) {
        return new GenericEntity<List<Tratamento>>(list){}; 
    }

    @Override
    public DAO getDao() {
        return tratamentoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }
    
    
    
}
