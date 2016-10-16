package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.entity.Evento;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named
@Dependent
public class EventoDAO {

//    private Session sessao;
//    private Transaction transacao;
//
//    public void salvar(Evento evento) {
//        try {
//            sessao = HibernateUtil.getSession();
//            transacao = sessao.beginTransaction();
//            sessao.save(evento);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public void atualizar(Evento evento) {
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            transacao = sessao.beginTransaction();
//            sessao.update(evento);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public void excluir(Evento evento) {
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            transacao = sessao.beginTransaction();
//            sessao.delete(evento);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public List<Evento> listar() {
//        List<Evento> eventos;
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            eventos
//                    = sessao.createCriteria(Evento.class)
//                    .list();
//        } finally {
//            sessao.close();
//        }
//        return eventos;
//    }
//
//    public Evento listar(Long id) {
//        Evento evento;
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            evento = (Evento) sessao.createCriteria(Evento.class)
//                    .add(Restrictions.eq("id", id))
//                    .uniqueResult();
//        } finally {
//            sessao.close();
//        }
//        return evento;
//    }
    @PersistenceContext(unitName = "BoraComerPU")
    private EntityManager em;

    @Transactional
    public void excluir(Evento usuario) {
        this.em.remove(this.em.contains(usuario) ? usuario : this.em.merge(usuario));
    }

    @SuppressWarnings("unchecked")
    public List<Evento> listaEventos() {
        return this.em.createQuery("select u from evento u").getResultList();
    }

    @Transactional
    public void salvar(Evento usuario) {
        this.em.merge(usuario);
    }

    public void atualizar(Evento usuario) {
        this.em.merge(usuario);
    }

}
