/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.AntecedenteLaboral;
import cl.inacap.percadi.model.Ciudad;
import cl.inacap.percadi.model.Curriculum;
import cl.inacap.percadi.model.Discapacidad;
import cl.inacap.percadi.model.Provincia;
import cl.inacap.percadi.model.TipoEstudio;
import cl.inacap.percadi.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author alvaro
 */
public class CurriculumDAOMYSQL implements CurriculumDAO {

    @Override
    public void Persist(Curriculum curriculum, Ciudad ciudad, Discapacidad discapacidad, Provincia provincia, TipoEstudio tipoestudio, AntecedenteLaboral antecedentelaboral, HttpServletRequest request) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario u = (Usuario) request.getSession().getAttribute("usuario");

        System.out.println(antecedentelaboral.getNombreempresa());

        curriculum.setCiudad(ciudad);
        curriculum.setDiscapacidad(discapacidad);
        curriculum.setProvincia(provincia);
        curriculum.setTipoestudio(tipoestudio);
        curriculum.setAntecedentelaboral(antecedentelaboral);
        curriculum.setUsuario(u);

        em.persist(curriculum);

        em.getTransaction().commit();
        em.close();

    }


    @Override
    public List<Curriculum> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Curriculum> list = em.createNamedQuery("Curriculum.findAll", Curriculum.class);

        return list.getResultList();

    }

}
