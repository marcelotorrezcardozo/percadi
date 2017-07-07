/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.Empresa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alvaro
 */
public class EmpresaDAOMYSQL implements EmpresaDAO{

    @Override
    public Empresa Register(String nombre, String email, String contraseña, String rut, String razonsocial, String telefono, String nombrecontacto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        Empresa empresa = new Empresa(nombre, email, contraseña, rut, razonsocial, telefono, nombrecontacto);
        
        em.getTransaction().begin();
        em.persist(empresa);
        em.getTransaction().commit();
        em.close();
        
        return empresa;
        
    }
    
    
    
}
