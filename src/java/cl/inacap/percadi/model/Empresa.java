/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alvaro
 */

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "emp_nombre")
    private String nombre;
    
    @Column(name = "emp_email")
    private String email;
    
    @Column(name = "emp_contraseña")
    private String contraseña;
    
    @Column(name = "emp_rut")
    private String rut;
    
    @Column(name = "emp_razonsocial")
    private String razonsocial;
    
    @Column(name = "emp_telefono")
    private String telefono;
    
    @Column(name = "emp_nombrecontacto")
    private String nombrecontacto;

    public Empresa() {
        super();
    }

    public Empresa(String nombre, String email, String contraseña, String rut, String razonsocial, String telefono, String nombrecontacto) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rut = rut;
        this.razonsocial = razonsocial;
        this.telefono = telefono;
        this.nombrecontacto = nombrecontacto;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
