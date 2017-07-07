package cl.inacap.percadi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ciudad.class)
public abstract class Ciudad_ {

	public static volatile SingularAttribute<Ciudad, Integer> id;
	public static volatile SingularAttribute<Ciudad, String> nombre;
	public static volatile ListAttribute<Ciudad, Curriculum> curriculumList;

}

