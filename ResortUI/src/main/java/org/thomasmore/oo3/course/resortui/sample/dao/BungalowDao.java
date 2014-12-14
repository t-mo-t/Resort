/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thomasmore.oo3.course.resortui.sample.dao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import org.thomasmore.oo3.course.resortui.sample.business.entity.SampleBungalowEntity;
import org.thomasmore.oo3.course.resortui.sample.business.entity.SampleParkEntity;

/**
 *
 * @author Gun
 */
    @Stateless
    public class BungalowDao implements Serializable {

        @PersistenceContext
        private EntityManager em;

        public void save(SampleBungalowEntity bungalowEntity) {
            em.persist(bungalowEntity);
        }

        public List<SampleBungalowEntity> listAll() {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SampleBungalowEntity.class));
            Query q = em.createQuery(cq);
            return q.getResultList();
        }

        public SampleBungalowEntity findById(String id) {
            return em.find(SampleBungalowEntity.class, id);
        }

        public void deleteById(String id) {
            em.remove(findById(id));
        }
    }

