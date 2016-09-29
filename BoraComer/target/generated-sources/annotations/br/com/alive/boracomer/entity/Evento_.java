package br.com.alive.boracomer.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Evento.class)
public abstract class Evento_ {

	public static volatile SingularAttribute<Evento, String> hora;
	public static volatile SingularAttribute<Evento, Long> idEvento;
	public static volatile SingularAttribute<Evento, String> nome;
	public static volatile SingularAttribute<Evento, Restaurante> local;
	public static volatile SingularAttribute<Evento, String> descricao;

}

