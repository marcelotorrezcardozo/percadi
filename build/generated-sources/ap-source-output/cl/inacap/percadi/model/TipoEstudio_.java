package cl.inacap.percadi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TipoEstudio.class)
public abstract class TipoEstudio_ {

	public static volatile SingularAttribute<TipoEstudio, String> tipo;
	public static volatile SingularAttribute<TipoEstudio, Character> estado;
	public static volatile SingularAttribute<TipoEstudio, Integer> id;
	public static volatile ListAttribute<TipoEstudio, Curriculum> curriculum;

}

