/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.controller;

import cl.inacap.percadi.dao.EmpresaDAO;
import cl.inacap.percadi.dao.EmpresaDAOMYSQL;
import cl.inacap.percadi.dao.UsuarioDAO;
import cl.inacap.percadi.dao.UsuarioDAOMYSQL;
import cl.inacap.percadi.model.Empresa;
import cl.inacap.percadi.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvaro
 */
public class LoginController extends HttpServlet {

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

        String estado = request.getParameter("accion");

        switch (estado) {
            case "register":
                String txtNombre = request.getParameter("txtNombre");
                String txtApellido = request.getParameter("txtApellido");
                String txtCorreo = request.getParameter("txtEmail");
                String txtNick = request.getParameter("txtNick");
                String txtContraseña = request.getParameter("txtPassword");

                UsuarioDAO udao = new UsuarioDAOMYSQL();
                Usuario u = udao.Register(txtNombre, txtApellido, txtCorreo, txtNick, txtContraseña);

                request.getSession(true).setAttribute("usuario", u);
                request.getRequestDispatcher("index.jsp").forward(request, response);

                break;
            case "login":
                String txtEmail = request.getParameter("txtEmail");
                String txtLoginContraseña = request.getParameter("txtPassword");
                UsuarioDAO loginudao = new UsuarioDAOMYSQL();
                Usuario ulogin = loginudao.Login(txtEmail, txtLoginContraseña);
                request.getSession().setAttribute("usuario", ulogin);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "registerempresa":
                String txtNombreEmpresa = request.getParameter("txtNombreEmpresa");
                String txtEmailEmpresa = request.getParameter("txtEmailEmpresa");
                String txtContraseñaEmpresa = request.getParameter("txtContraseñaEmpresa");
                String txtRutEmpresa = request.getParameter("txtRutEmpresa");
                String txtRazonSocialEmpresa = request.getParameter("txtRazonSocialEmpresa");
                String txtTelefonoEmpresa = request.getParameter("txtTelefonoEmpresa");
                String txtNombreContactoEmpresa = request.getParameter("txtNombreContactoEmpresa");

                EmpresaDAO edao = new EmpresaDAOMYSQL();
                Empresa empresa = edao.Register(txtNombreEmpresa, txtEmailEmpresa, txtContraseñaEmpresa, txtRutEmpresa,
                        txtRazonSocialEmpresa, txtTelefonoEmpresa, txtNombreContactoEmpresa);
                request.getSession().setAttribute("empresa", empresa);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
        }
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
