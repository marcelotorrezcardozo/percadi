package cl.inacap.percadi.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> nick;
	public static volatile SingularAttribute<Usuario, String> apellido;
	public static volatile SingularAttribute<Usuario, String> correo;
	public static volatile SingularAttribute<Usuario, Integer> id;
	public static volatile SingularAttribute<Usuario, Curriculum> curriculum;
	public static volatile SingularAttribute<Usuario, String> nombre;
	public static volatile SingularAttribute<Usuario, String> contraseña;

}

