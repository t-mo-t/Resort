
package org.thomasmore.oo3.course.resortui.dao;


import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.thomasmore.oo3.course.resortui.business.entity.ParkEntity;

/**
 *
 * @author lucs
 */

@Stateless
public class ParkDao implements Serializable {

    @PersistenceContext
    private EntityManager em;

    public void save(ParkEntity parkEntity) {
        em.persist(parkEntity);
    }

    public List<ParkEntity> listAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(ParkEntity.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public ParkEntity findById(String id) {
        return em.find(ParkEntity.class, id);
    }

    public void deleteById(String id) {
        em.remove(findById(id));
    }
}

