/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao;

import com.genericrest.model.Chamado;
import java.util.List;

/**
 *
 * @author Almeida
 */
public interface ChamadoDAO extends DAO<Chamado, Long>{
    
    List<Chamado> finByNome(String nome);
}
