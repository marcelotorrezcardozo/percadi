/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.Empresa;

/**
 *
 * @author alvaro
 */
public interface EmpresaDAO {

    public Empresa Register(String nombre, String email, String contraseña, String rut,
             String razonsocial, String telefono, String nombrecontacto);
    public Empresa Login(String correo,String password);
}
