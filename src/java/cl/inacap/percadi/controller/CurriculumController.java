/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.controller;

import cl.inacap.percadi.dao.CurriculumDAO;
import cl.inacap.percadi.dao.CurriculumDAOMYSQL;
import cl.inacap.percadi.model.AntecedenteLaboral;
import cl.inacap.percadi.model.Ciudad;
import cl.inacap.percadi.model.Curriculum;
import cl.inacap.percadi.model.Discapacidad;
import cl.inacap.percadi.model.Provincia;
import cl.inacap.percadi.model.TipoEstudio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvaro
 */
public class CurriculumController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        String txtTipoDiscapacidad = request.getParameter("txtDiscapacidad");
        String txtTelefono = request.getParameter("txtTelefono");
        String txtProvincia = request.getParameter("txtProvincia");
        String txtCiudad = request.getParameter("txtCiudad");
        String txtTituloCarrera = request.getParameter("txtTituloCarrera");
        String txtInstitucion = request.getParameter("txtInstitucion");
        String txtPromedioNotas = request.getParameter("txtPromedioNotas");
        String txtTipoEstudio = request.getParameter("txtTipoEstudio");
        String txtEstado = request.getParameter("txtEstado");
        String txtNombreEmpresa = request.getParameter("txtNombreEmpresa");
        String txtPuesto = request.getParameter("txtPuesto");
        String txtNivelExperiencia = request.getParameter("txtNivelExperiencia");

        float promedionotas = Float.parseFloat(txtPromedioNotas);
        char estado = txtEstado.charAt(0);

        Curriculum curriculum = new Curriculum(txtTelefono, txtTituloCarrera, promedionotas, txtInstitucion);

        int intciudad = Integer.parseInt(txtCiudad);
        int intdiscapacidad = Integer.parseInt(txtTipoDiscapacidad);
        int intprovincia = Integer.parseInt(txtProvincia);

        Ciudad c = em.find(Ciudad.class, intciudad);
        Ciudad ciudad = new Ciudad(c.getId(),c.getNombre());
        
        Discapacidad d = em.find(Discapacidad.class, intdiscapacidad);
        Discapacidad discapacidad = new Discapacidad(d.getId(),d.getNombre());

        Provincia p = em.find(Provincia.class, intprovincia);
        Provincia provincia = new Provincia(p.getId(),p.getNombre());

        TipoEstudio tipoestudio = new TipoEstudio(txtTipoEstudio, estado);
        
        AntecedenteLaboral antecedentelaboral = new AntecedenteLaboral(txtNombreEmpresa, txtPuesto, txtNivelExperiencia);

        CurriculumDAO cdao = new CurriculumDAOMYSQL();

        System.out.println(txtTelefono);
        cdao.Persist(curriculum, ciudad, discapacidad, provincia, tipoestudio, antecedentelaboral, request);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
