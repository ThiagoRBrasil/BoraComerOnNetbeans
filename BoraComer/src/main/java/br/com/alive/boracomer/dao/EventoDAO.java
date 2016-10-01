package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.alive.boracomer.entity.Evento;
import java.util.List;
import org.hibernate.criterion.Restrictions;

public class EventoDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Evento evento) {
        try {
            sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.save(evento);
            transacao.commit();
        } finally {
            sessao.close();
        }
    }

    public void atualizar(Evento evento) {
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            transacao = sessao.beginTransaction();
            sessao.update(evento);
            transacao.commit();
        } finally {
            sessao.close();
        }
    }

    public void excluir(Evento evento) {
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(evento);
            transacao.commit();
        } finally {
            sessao.close();
        }
    }

    public List<Evento> listar() {
        List<Evento> eventos;
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            eventos
                    = sessao.createCriteria(Evento.class)
                    .list();
        } finally {
            sessao.close();
        }
        return eventos;
    }

    public Evento listar(Long id) {
        Evento evento;
        try {
            sessao = HibernateUtil.getSessionFactory().
                    openSession();
            evento = (Evento) sessao.createCriteria(Evento.class)
                    .add(Restrictions.eq("id", id))
                    .uniqueResult();
        } finally {
            sessao.close();
        }
        return evento;
    }

}
