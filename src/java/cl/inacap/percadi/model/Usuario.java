/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author alvaro
 */
@Entity
@Table(name = "usuario")
@NamedQuery(name = "Usuario.findByCorreo", query = "select u from Usuario u where u.correo =:correo")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "usu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "usu_nombre")
    private String nombre;

    @Column(name = "usu_apellido")
    private String apellido;

    @Column(name = "usu_correo")
    private String correo;

    @Column(name = "usu_nombreusuario")
    private String nick;

    @Column(name = "usu_contraseña")
    private String contraseña;

    @OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL)
    private Curriculum curriculum;

    public Usuario() {
        super();
    }

    public Usuario(String nombre, String apellido, String correo, String nick, String contraseña) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nick = nick;
        this.contraseña = contraseña;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
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
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    

}
