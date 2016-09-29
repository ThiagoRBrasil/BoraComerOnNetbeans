package br.com.alive.boracomer.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, Integer> idade;
	public static volatile SingularAttribute<Usuario, Long> idUsuario;
	public static volatile ListAttribute<Usuario, Usuario> amigos;
	public static volatile SingularAttribute<Usuario, String> email;

}

