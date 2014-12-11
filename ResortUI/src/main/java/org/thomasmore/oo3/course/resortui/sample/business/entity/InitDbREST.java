
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
    public ParkEntity createDB(){
        
        List<Object> objectsToSave = new LinkedList<>();
        
        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setName("Zemst");
        objectsToSave.add(parkEntity);
        
        parkEntity = new ParkEntity();
        parkEntity.setName("Mechelen");
        objectsToSave.add(parkEntity);
        
        BungalowEntity bungalowEntity = new BungalowEntity();
        bungalowEntity.setName("abc");
        objectsToSave.add(bungalowEntity);
        
        //for(objectsToSave...){
           
        em.persist(parkEntity);
         
        //}
        return parkEntity;
    }
}
