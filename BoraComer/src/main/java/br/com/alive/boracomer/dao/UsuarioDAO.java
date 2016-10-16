package br.com.alive.boracomer.dao;

import br.com.alive.boracomer.entity.Usuario;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named
@Dependent
public class UsuarioDAO {

//    private Session sessao;
//    private Transaction transacao;
//
//    public void salvar(Usuario usuario) {
//        try {
//            sessao = HibernateUtil.getSession();
//            transacao = sessao.beginTransaction();
//            sessao.save(usuario);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public void atualizar(Usuario usuario) {
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            transacao = sessao.beginTransaction();
//            sessao.update(usuario);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public void excluir(Usuario usuario) {
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            transacao = sessao.beginTransaction();
//            sessao.delete(usuario);
//            transacao.commit();
//        } finally {
//            sessao.close();
//        }
//    }
//
//    public List<Usuario> listar() {
//        List<Usuario> usuarios;
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            usuarios
//                    = sessao.createCriteria(Usuario.class)
//                    .list();
//        } finally {
//            sessao.close();
//        }
//        return usuarios;
//    }
//
//    public Usuario listar(Long id) {
//        Usuario usuario;
//        try {
//            sessao = HibernateUtil.getSessionFactory().
//                    openSession();
//            usuario = (Usuario) sessao.createCriteria(Usuario.class)
//                    .add(Restrictions.eq("id", id))
//                    .uniqueResult();
//        } finally {
//            sessao.close();
//        }
//        return usuario;
//    }
    @PersistenceContext(unitName = "BoraComerPU")
    private EntityManager em;

    @Transactional
    public void excluir(Usuario usuario) {
        this.em.remove(this.em.contains(usuario) ? usuario : this.em.merge(usuario));
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> listaEventos() {
        return this.em.createQuery("select u from usuario u").getResultList();
    }

    @Transactional
    public void salvar(Usuario usuario) {
        this.em.merge(usuario);
    }

    public void atualizar(Usuario usuario) {
        this.em.merge(usuario);
    }

}
