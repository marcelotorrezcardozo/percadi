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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alvaro
 */

@Entity
@Table(name = "tipoestudio")
public class TipoEstudio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "te_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "te_tipo")
    private String tipo;
    
    @Column(name = "te_estado")
    private char estado;
    
    @OneToMany(mappedBy = "tipoestudio")
    private List<Curriculum> curriculum;

    public TipoEstudio() {
        super();
    }

    public TipoEstudio(String tipo, char estado) {
        super();
        this.tipo = tipo;
        this.estado = estado;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public List<Curriculum> getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(List<Curriculum> curriculum) {
        this.curriculum = curriculum;
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
        final TipoEstudio other = (TipoEstudio) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
}
