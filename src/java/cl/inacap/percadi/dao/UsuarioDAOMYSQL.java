/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author alvaro
 */
public class UsuarioDAOMYSQL implements UsuarioDAO {

    @Override
    public Usuario Register(String nombre, String apellido, String correo, String nick, String contraseña) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario u = new Usuario(nombre, apellido, correo, nick, contraseña);
        em.persist(u);
        em.getTransaction().commit();
        em.close();
        return u;
    }

    @Override
    public void logOut(HttpServletRequest request) {
        request.getSession().invalidate();
    }

    @Override
    public Usuario Login(String correo, String contraseña) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        Usuario u = null;

        try {
            TypedQuery<Usuario> result = em.createNamedQuery("Usuario.findByCorreo", Usuario.class);
            result.setParameter("correo", correo);
            u = result.getSingleResult();
            
            if (u.getContraseña().equals(contraseña)) {
                return u;
            }

        } catch (Exception nre) {
            System.out.println("error, datos incorrectos.");

        }
        em.close();
        
        return null;

    }

}
