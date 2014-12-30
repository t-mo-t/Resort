
package org.thomasmore.oo3.course.resortui.ui.rest;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.thomasmore.oo3.course.resortui.entity.*;



@Stateless
@Path("init-db")
public class InitDbREST {

    @PersistenceContext(unitName = "RESORTPU")
    private EntityManager em;
    
    
    @GET
    @Produces({"application/json", "application/xml"})
    public ParkEntity createDB() {
        List<Object> objectsToSave= new LinkedList<>();
        
        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setName("PARK 1");
        objectsToSave.add(parkEntity);
        
        parkEntity = new ParkEntity();
        parkEntity.setName("PARK 2");
        objectsToSave.add(parkEntity);
        
        BungalowEntity BungalowEntity = new BungalowEntity();
        BungalowEntity.setName("BUNGALOW 1");
        objectsToSave.add(BungalowEntity);
        
        BungalowEntity = new BungalowEntity();
        BungalowEntity.setName("BUNGALOW 2");
        objectsToSave.add(BungalowEntity);
        
      CustomerEntity customerEntity = new CustomerEntity();
      customerEntity.setFirstName("Test1");
      objectsToSave.add(customerEntity);
        
//        List<Object> objectsToSave = new LinkedList<>();
       for(Object objectsToSave1 : objectsToSave){
        em.persist(objectsToSave1);
       }
       
        return parkEntity;
    }

}
