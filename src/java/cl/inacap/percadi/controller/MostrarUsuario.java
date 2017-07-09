/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.controller;

import cl.inacap.percadi.dao.CiudadDAO;
import cl.inacap.percadi.dao.CiudadDAOMYSQL;
import cl.inacap.percadi.dao.CurriculumDAO;
import cl.inacap.percadi.dao.CurriculumDAOMYSQL;
import cl.inacap.percadi.dao.DiscapacidadDAO;
import cl.inacap.percadi.dao.DiscapacidadDAOMYSQL;
import cl.inacap.percadi.dao.ProvinciaDAO;
import cl.inacap.percadi.dao.ProvinciaDAOMYSQL;
import cl.inacap.percadi.model.Ciudad;
import cl.inacap.percadi.model.Curriculum;
import cl.inacap.percadi.model.Discapacidad;
import cl.inacap.percadi.model.Provincia;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvaro
 */
public class MostrarUsuario extends HttpServlet {

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

        
        DiscapacidadDAO ddao = new DiscapacidadDAOMYSQL();
        ProvinciaDAO pdao = new ProvinciaDAOMYSQL();
        CiudadDAO cdao = new CiudadDAOMYSQL();
        CurriculumDAO ccdao = new CurriculumDAOMYSQL();
        
        List<Provincia> provList = pdao.findAll();
        List<Discapacidad> discList = ddao.findAll();
        List<Ciudad> ciuList = cdao.findAll();
        List<Curriculum> curlist = ccdao.findAll();
        
        request.setAttribute("discList", discList);
        request.setAttribute("provList", provList);
        request.setAttribute("ciuList", ciuList);
        request.setAttribute("curlist", curlist);
        
        request.getRequestDispatcher("buscarusuario.jsp").forward(request, response);
        
        
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
