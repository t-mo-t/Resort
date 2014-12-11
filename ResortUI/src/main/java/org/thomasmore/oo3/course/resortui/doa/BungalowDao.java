
package org.thomasmore.oo3.course.resortui.doa;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;

/**
 *
 * @author Jasper & Nico
 */
@Stateless
public class BungalowDao implements Serializable {

    @PersistenceContext
    private EntityManager em;

    public void save(BungalowEntity bungalowEntity) {
        em.persist(bungalowEntity);
    }

    public List<BungalowEntity> listAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(BungalowEntity.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public BungalowEntity findById(String id) {
        return em.find(BungalowEntity.class, id);
    }

    public void deleteById(String id) {
        em.remove(findById(id));
    }
}
