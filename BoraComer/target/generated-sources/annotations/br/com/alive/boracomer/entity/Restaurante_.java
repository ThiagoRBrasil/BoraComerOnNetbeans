package br.com.alive.boracomer.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Restaurante.class)
public abstract class Restaurante_ {

	public static volatile SingularAttribute<Restaurante, String> tipo;
	public static volatile SingularAttribute<Restaurante, Endereco> endereco;
	public static volatile SingularAttribute<Restaurante, Long> idRestaurante;
	public static volatile SingularAttribute<Restaurante, String> nome;

}

