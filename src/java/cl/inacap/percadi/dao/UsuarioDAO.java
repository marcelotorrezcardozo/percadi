/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.Usuario;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author alvaro
 */
public interface UsuarioDAO {
    public Usuario Register(String nombre, String apellido, String correo, String nick, String contraseña);
    public Usuario Login(String correo , String contraseña);
    public void logOut(HttpServletRequest request);
    
}
