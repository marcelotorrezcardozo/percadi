/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.percadi.dao;

import cl.inacap.percadi.model.AntecedenteLaboral;
import cl.inacap.percadi.model.Ciudad;
import cl.inacap.percadi.model.Curriculum;
import cl.inacap.percadi.model.Discapacidad;
import cl.inacap.percadi.model.Provincia;
import cl.inacap.percadi.model.TipoEstudio;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author alvaro
 */
public interface CurriculumDAO {

    public void Persist(Curriculum curriculum , Ciudad ciudad , Discapacidad discapacidad, 
            Provincia provincia, TipoEstudio tipoestudio ,AntecedenteLaboral antecedentelaboral,HttpServletRequest request);
           

}
