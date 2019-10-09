/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.TipoItem;
import java.util.List;

/**
 *
 * @author 2146516
 */
public interface TipoItemDAO {
   public void save(TipoItem it) throws PersistenceException;

   public TipoItem load(int id) throws PersistenceException;
   public List<TipoItem> load() throws PersistenceException;
}