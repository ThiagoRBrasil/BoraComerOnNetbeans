 package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.alive.boracomer.entity.Restaurante;
import java.util.List;
import org.hibernate.criterion.Restrictions;

public class RestauranteDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Restaurante restaurante) {
        try {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.save(restaurante);
            transacao.commit();
        } finally {
            sessao.close();
        }
    }

    public void atualizar(Restaurante restaurante) {
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            transacao = sessao.beginTransaction();
            sessao.update(restaurante);
            transacao.commit();
        } finally {
            sessao.close();
        }
    }

    public void excluir(Restaurante restaurante) {
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(restaurante);
            transacao.commit();
        } finally {
            sessao.close();
        }
    }

    public List<Restaurante> listar() {
        List<Restaurante> restaurantes;
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            restaurantes
                    = sessao.createCriteria(Restaurante.class)
                    .list();
        } finally {
            sessao.close();
        }
        return restaurantes;
    }

    public Restaurante listar(Long id) {
        Restaurante restaurante;
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            restaurante = (Restaurante) sessao.createCriteria(Restaurante.class)
                    .add(Restrictions.eq("id", id))
                    .uniqueResult();
        } finally {
            sessao.close();
        }
        return restaurante;
    }
    
}
