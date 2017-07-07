package cl.inacap.percadi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curriculum.class)
public abstract class Curriculum_ {

	public static volatile SingularAttribute<Curriculum, String> titulocarrera;
	public static volatile SingularAttribute<Curriculum, Float> promedio;
	public static volatile SingularAttribute<Curriculum, Ciudad> ciudad;
	public static volatile SingularAttribute<Curriculum, AntecedenteLaboral> antecedentelaboral;
	public static volatile SingularAttribute<Curriculum, String> institucion;
	public static volatile SingularAttribute<Curriculum, Discapacidad> discapacidad;
	public static volatile SingularAttribute<Curriculum, TipoEstudio> tipoestudio;
	public static volatile SingularAttribute<Curriculum, Usuario> usuario;
	public static volatile SingularAttribute<Curriculum, Integer> id;
	public static volatile SingularAttribute<Curriculum, String> telefono;
	public static volatile SingularAttribute<Curriculum, Provincia> provincia;

}

