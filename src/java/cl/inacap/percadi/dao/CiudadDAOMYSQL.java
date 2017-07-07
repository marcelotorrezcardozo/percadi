/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.Ciudad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author alvaro
 */
public class CiudadDAOMYSQL implements CiudadDAO{

    @Override
    public List<Ciudad> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Ciudad> list = em.createNamedQuery("Ciudad.findAll",Ciudad.class);
        
        return list.getResultList();
        
    }
    
}
