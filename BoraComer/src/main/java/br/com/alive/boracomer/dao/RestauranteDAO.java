package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.entity.Restaurante;

import java.util.List;

public class RestauranteDAO extends JPAUtil {

    private static RestauranteDAO instance;

    public static RestauranteDAO getInstance() {
        if (instance == null) {
            instance = new RestauranteDAO();
        }

        return instance;
    }

    private RestauranteDAO() {
        entityManager = getEntityManager();
    }

    public Restaurante salvar(Restaurante restaurante) throws Exception {
        try {
            entityManager.getTransaction().begin();
            if (restaurante.getIdRestaurante() == null) {
                entityManager.persist(restaurante);
            } else {
                restaurante = entityManager.merge(restaurante);
            }
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return restaurante;
    }

    public void excluir(Long id) {
        try {
            entityManager.getTransaction().begin();
            Restaurante restaurante = entityManager.find(Restaurante.class, id);
            entityManager.remove(restaurante);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    public Restaurante getById(final Long id) {
        return entityManager.find(Restaurante.class, id);
    }

    public boolean containsEvento(Restaurante restaurante) {
        boolean exist;
        try {
            entityManager.getTransaction().begin();
            exist = entityManager.contains(restaurante);
        } finally {
            entityManager.close();
        }
        return exist;
    }

    @SuppressWarnings("unchecked")
    public List<Restaurante> findAll() {
        return entityManager.createQuery("FROM " + Restaurante.class.getName()).getResultList();
    }

}
