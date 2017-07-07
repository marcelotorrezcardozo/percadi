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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author alvaro
 */

@Entity
@Table(name = "antecedentelaboral")
public class AntecedenteLaboral implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "al_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "al_nombreempresa")
    private String nombreempresa;

    @Column(name = "al_puesto")
    private String puesto;

    @Column(name = "al_experiencia")
    private String experiencia;

    @OneToOne(mappedBy = "antecedentelaboral",fetch = FetchType.LAZY)
    private Curriculum curriculum;

    public AntecedenteLaboral() {
        super();
    }

    public AntecedenteLaboral(String nombreempresa, String puesto, String experiencia) {
        super();
        this.nombreempresa = nombreempresa;
        this.puesto = puesto;
        this.experiencia = experiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
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
        final AntecedenteLaboral other = (AntecedenteLaboral) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
