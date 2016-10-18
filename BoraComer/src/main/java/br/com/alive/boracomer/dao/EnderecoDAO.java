/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.entity.Endereco;
import java.util.List;

/**
 *
 * @author ThiagoBrasil
 */
public class EnderecoDAO extends JPAUtil {
    private static EnderecoDAO instance;

    public static EnderecoDAO getInstance() {
        if (instance == null) {
            instance = new EnderecoDAO();
        }

        return instance;
    }

    private EnderecoDAO() {
        entityManager = super.getEntityManager();
    }

    public void salvar(Endereco endereco) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(endereco);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void atualizar(Endereco endereco) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(endereco);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void excluir(Long id) {
        try {
            entityManager.getTransaction().begin();
            Endereco endereco = entityManager.find(Endereco.class, id);
            entityManager.remove(endereco);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    public Endereco getById(final Long id) {
        return entityManager.find(Endereco.class, id);
    }

    public boolean containsEvento(Endereco endereco) {
        boolean exist;
        try {
            entityManager.getTransaction().begin();
            exist = entityManager.contains(endereco);
        } finally {
            entityManager.close();
        }
        return exist;
    }

    @SuppressWarnings("unchecked")
    public List<Endereco> findAll() {
        return entityManager.createQuery("FROM " + Endereco.class.getName()).getResultList();
    }

}
