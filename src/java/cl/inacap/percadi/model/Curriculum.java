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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author alvaro
 */
@Entity
@Table(name = "curriculum")
@NamedQueries({
    @NamedQuery(name = "Curriculum.Filter", query = "SELECT c from Curriculum c WHERE c.edad =:edad AND c.sexo=:sexo AND c.provincia=:provincia AND c.ciudad=:ciudad AND c.discapacidad =:discapacidad "
            + " "),
    @NamedQuery(name = "Curriculum.findAll", query = "SELECT c from Curriculum c")})
public class Curriculum implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cur_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cur_telefono")
    private String telefono;

    @Column(name = "cur_edad")
    private int edad;

    @Column(name = "cur_titulocarrera")
    private String titulocarrera;
    
    @Column(name = "cur_salario")
    private String salario;

    @Column(name = "cur_promedio")
    private float promedio;

    @Column(name = "cur_institucion")
    private String institucion;

    @Column(name = "cur_sexo")
    private char sexo;

    @JoinColumn(name = "usuario_usu_id", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @JoinColumn(name = "discapacidad_disc_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Discapacidad discapacidad;

    @JoinColumn(name = "provincia_prov_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Provincia provincia;

    @JoinColumn(name = "ciudad_ciu_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Ciudad ciudad;

    @JoinColumn(name = "tipoestudio_te_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private TipoEstudio tipoestudio;

    @JoinColumn(name = "antecedentelaboral_al_id", nullable = false)
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private AntecedenteLaboral antecedentelaboral;

    public Curriculum() {
        super();
    }

    public Curriculum(String telefono, int edad, String titulocarrera, float promedio, String institucion, char sexo,String salario) {
        super();
        this.telefono = telefono;
        this.edad = edad;
        this.titulocarrera = titulocarrera;
        this.promedio = promedio;
        this.institucion = institucion;
        this.sexo = sexo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitulocarrera() {
        return titulocarrera;
    }

    public void setTitulocarrera(String titulocarrera) {
        this.titulocarrera = titulocarrera;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Discapacidad getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Discapacidad discapacidad) {
        this.discapacidad = discapacidad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public TipoEstudio getTipoestudio() {
        return tipoestudio;
    }

    public void setTipoestudio(TipoEstudio tipoestudio) {
        this.tipoestudio = tipoestudio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public AntecedenteLaboral getAntecedentelaboral() {
        return antecedentelaboral;
    }

    public void setAntecedentelaboral(AntecedenteLaboral antecedentelaboral) {
        this.antecedentelaboral = antecedentelaboral;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
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
        final Curriculum other = (Curriculum) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
