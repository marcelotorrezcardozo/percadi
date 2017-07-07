package cl.inacap.percadi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Discapacidad.class)
public abstract class Discapacidad_ {

	public static volatile SingularAttribute<Discapacidad, Integer> id;
	public static volatile SingularAttribute<Discapacidad, String> nombre;
	public static volatile ListAttribute<Discapacidad, Curriculum> curriculumList;

}

