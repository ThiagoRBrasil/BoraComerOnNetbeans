package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.entity.Usuario;

import java.util.List;

public class UsuarioDAO extends JPAUtil {

    private static UsuarioDAO instance;

    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }

        return instance;
    }

    private UsuarioDAO() {
        entityManager = super.getEntityManager();
    }
    
    public void salvar(Usuario usuario) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(usuario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void atualizar(Usuario usuario) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(usuario);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void excluir(Long id) {
        try {
            entityManager.getTransaction().begin();
            Usuario usuario = entityManager.find(Usuario.class, id);
            entityManager.remove(usuario);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    public Usuario getById(final Long id) {
        return entityManager.find(Usuario.class, id);
    }

    public boolean containsEvento(Usuario evento) {
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
    public List<Usuario> findAll() {
        return entityManager.createQuery("select u from Usuario u", Usuario.class).getResultList();
    }

}
