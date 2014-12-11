package org.thomasmore.oo3.course.resortui.entity;

import org.thomasmore.oo3.course.resortui.entity.ParkEntity;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
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
    public ParkEntity createDB() {

        List<Object> objectsToSave = new LinkedList<>();

        // parks
        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setName("ABC");
        objectsToSave.add(parkEntity);
/*
        parkEntity = new ParkEntity();
        parkEntity.setName("Zeeland");
        objectsToSave.add(parkEntity);

        parkEntity = new ParkEntity();
        parkEntity.setName("Erperheide");
        objectsToSave.add(parkEntity);

        // bungalows
        BungalowEntity bungalowEntity = new BungalowEntity();
        bungalowEntity.setName("Comfort");
        objectsToSave.add(bungalowEntity);

        bungalowEntity = new BungalowEntity();
        bungalowEntity.setName("Premium");
        objectsToSave.add(bungalowEntity);

        bungalowEntity = new BungalowEntity();
        bungalowEntity.setName("VIP");
        objectsToSave.add(bungalowEntity);

        bungalowEntity = new BungalowEntity();
        bungalowEntity.setName("Jungle-cabana");
        objectsToSave.add(bungalowEntity);

        bungalowEntity = new BungalowEntity();
        bungalowEntity.setName("Hotelroom");
        objectsToSave.add(bungalowEntity);
        
        bungalowEntity = new BungalowEntity();
        bungalowEntity.setName("Children-friendly");
        objectsToSave.add(bungalowEntity);
*/
        for (Object objectsToSave1 : objectsToSave) {

            em.persist(objectsToSave1);

        }
        return parkEntity;
    }
}
