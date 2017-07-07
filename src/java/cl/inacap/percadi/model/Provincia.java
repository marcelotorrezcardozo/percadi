/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alvaro
 */
@Entity
@Table(name = "provincia")
@NamedQuery(name = "Provincia.findAll", query = "select p from Provincia p")
public class Provincia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "prov_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "prov_nombre")
    private String nombre;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Curriculum> curriculumList;

    public Provincia() {
        super();
    }

    public Provincia(int id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
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

    public List<Curriculum> getCurriculumList() {
        return curriculumList;
    }

    public void setCurriculumList(List<Curriculum> curriculumList) {
        this.curriculumList = curriculumList;
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
        final Provincia other = (Provincia) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
