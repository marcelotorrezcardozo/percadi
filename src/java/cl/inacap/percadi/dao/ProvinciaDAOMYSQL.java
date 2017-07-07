/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.Provincia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author alvaro
 */
public class ProvinciaDAOMYSQL implements ProvinciaDAO{

    @Override
    public List<Provincia> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Provincia> list = em.createNamedQuery("Provincia.findAll",Provincia.class);
        
        return list.getResultList();
        
    }
    
}
