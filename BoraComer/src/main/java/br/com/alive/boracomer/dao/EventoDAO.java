package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.entity.Evento;

import java.util.List;
import javax.persistence.EntityManager;

public class EventoDAO extends JPAUtil {

    private static EventoDAO instance;

    public static EventoDAO getInstance() {
        if (instance == null) {
            instance = new EventoDAO();
        }

        return instance;
    }

    private EventoDAO() {
        entityManager = getEntityManager();
    }

    public Evento salvar(Evento evento) throws Exception {
        EntityManager entityManager = getEntityManager();
        try {
            getEntityManager();
            entityManager.getTransaction().begin();
            if (evento.getId_evento()== null) {
                entityManager.persist(evento);
            } else {
                evento = entityManager.merge(evento);
            }
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return evento;
    }
    
    public void atualizar(Evento evento) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(evento);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void excluir(Long id) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Evento evento = entityManager.find(Evento.class, id);
            entityManager.remove(evento);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    public Evento getById(final Long id) {
        return entityManager.find(Evento.class, id);
    }

    public boolean containsEvento(Evento evento) {
        EntityManager entityManager = new JPAUtil().getEntityManager();
        boolean exist;
        try {
            entityManager.getTransaction().begin();
            exist = entityManager.contains(evento);
        } finally {
            entityManager.close();
        }
        return exist;
    }

    @SuppressWarnings("unchecked")
    public List<Evento> findAll() {
        return entityManager.createQuery("FROM " + Evento.class.getName()).getResultList();
    }

}
