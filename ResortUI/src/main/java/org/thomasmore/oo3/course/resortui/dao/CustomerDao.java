
package org.thomasmore.oo3.course.resortui.dao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.thomasmore.oo3.course.resortui.entity.CustomerEntity;


/**
 *
 * @author lucs
 */
@Stateless
public class CustomerDao implements Serializable {

    @PersistenceContext
    private EntityManager em;

    public void save(CustomerEntity bungalowEntity) {
        em.persist(bungalowEntity);
    }

    public List<CustomerEntity> listAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(CustomerEntity.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    public CustomerEntity findById(String id) {
        return em.find(CustomerEntity.class, id);
    }

    public void deleteById(String id) {
        em.remove(findById(id));
    }
}
