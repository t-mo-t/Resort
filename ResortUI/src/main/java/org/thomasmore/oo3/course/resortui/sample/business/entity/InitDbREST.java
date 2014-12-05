
package org.thomasmore.oo3.course.resortui.sample.business.entity;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Jasper & Nico
 */
@Stateless
@Path("init-db")
public class InitDbREST {
    
    @PersistenceContext(unitName = "RESORTPU")
    private EntityManager em;
    
    @GET
    @Produces({"application/json", "application/xml"})
    public ParkEntity find (@PathParam("id") String id){
        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setName("Zemst");
        
        
        List<Object> objectToSave = new LinkedList<>();
        em.persist(parkEntity);
        
        return parkEntity;
    }
}
