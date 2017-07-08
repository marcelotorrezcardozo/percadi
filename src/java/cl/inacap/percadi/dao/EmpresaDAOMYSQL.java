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
import javax.persistence.TypedQuery;

/**
 *
 * @author alvaro
 */
public class EmpresaDAOMYSQL implements EmpresaDAO {

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

    @Override
    public Empresa Login(String correo, String password) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        Empresa e = null;

        try {
            TypedQuery<Empresa> result = em.createNamedQuery("Empresa.findByEmail", Empresa.class);
            result.setParameter("email", correo);
            e = result.getSingleResult();

            if (e.getContraseña().equals(password)) {
                return e;
            }
        } catch (Exception nre) {
            System.out.println("error, datos incorrectos.");
        }
        em.close();

        return null;
    }

}
