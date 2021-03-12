/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven;

import gaes5.mouth.system.maven.Models.datos_usuario;
import gaes5.mouth.system.maven.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Cristo
 */
public class datos_usuarioJpaController implements Serializable {

    public datos_usuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(datos_usuario datos_usuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datos_usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(datos_usuario datos_usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datos_usuario = em.merge(datos_usuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = datos_usuario.getId();
                if (finddatos_usuario(id) == null) {
                    throw new NonexistentEntityException("The datos_usuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datos_usuario datos_usuario;
            try {
                datos_usuario = em.getReference(datos_usuario.class, id);
                datos_usuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The datos_usuario with id " + id + " no longer exists.", enfe);
            }
            em.remove(datos_usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<datos_usuario> finddatos_usuarioEntities() {
        return finddatos_usuarioEntities(true, -1, -1);
    }

    public List<datos_usuario> finddatos_usuarioEntities(int maxResults, int firstResult) {
        return finddatos_usuarioEntities(false, maxResults, firstResult);
    }

    private List<datos_usuario> finddatos_usuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(datos_usuario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public datos_usuario finddatos_usuario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(datos_usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getdatos_usuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<datos_usuario> rt = cq.from(datos_usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
