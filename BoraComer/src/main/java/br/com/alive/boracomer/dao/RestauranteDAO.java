package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.entity.Restaurante;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named
@Dependent
public class RestauranteDAO {

//    private Session sessao;
//    private Transaction transacao;
//
//    public void salvar(Restaurante restaurante) {
//        try {
//            sessao = HibernateUtil.getSession();
//            transacao = sessao.beginTransaction();
//            sessao.save(restaurante);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public void atualizar(Restaurante restaurante) {
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            transacao = sessao.beginTransaction();
//            sessao.update(restaurante);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public void excluir(Restaurante restaurante) {
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            transacao = sessao.beginTransaction();
//            sessao.delete(restaurante);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public List<Restaurante> listar() {
//        List<Restaurante> restaurantes;
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            restaurantes
//                    = sessao.createCriteria(Restaurante.class)
//                    .list();
//        } finally {
//            sessao.close();
//        }
//        return restaurantes;
//    }
//
//    public Restaurante listar(Long id) {
//        Restaurante restaurante;
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            restaurante = (Restaurante) sessao.createCriteria(Restaurante.class)
//                    .add(Restrictions.eq("id", id))
//                    .uniqueResult();
//        } finally {
//            sessao.close();
//        }
//        return restaurante;
//    }
    @PersistenceContext(unitName = "BoraComerPU")
    private EntityManager em;

    @Transactional
    public void excluir(Restaurante restaurante) {
        this.em.remove(this.em.contains(restaurante) ? restaurante : this.em.merge(restaurante));
    }

    @SuppressWarnings("unchecked")
    public List<Restaurante> listaEventos() {
        return this.em.createQuery("select u from restaurante u").getResultList();
    }

    @Transactional
    public void salvar(Restaurante restaurante) {
        this.em.merge(restaurante);
    }

    public void atualizar(Restaurante restaurante) {
        this.em.merge(restaurante);
    }

}
