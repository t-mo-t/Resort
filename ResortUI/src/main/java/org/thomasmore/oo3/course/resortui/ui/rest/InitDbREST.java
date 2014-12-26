package org.thomasmore.oo3.course.resortui.ui.rest;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.thomasmore.oo3.course.resortui.entity.CustomerEntity;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
import org.thomasmore.oo3.course.resortui.entity.ParkEntity;
import org.thomasmore.oo3.course.resortui.entity.ReservationEntity;

@Stateless
@Path("init-db")
public class InitDbREST {

    @PersistenceContext(unitName = "RESORTPU")
    private EntityManager em;

    @GET
    @Produces({"application/json", "application/xml"})
    public ParkEntity createDB() {
        List<Object> objectsToSave = new LinkedList<>();
        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setName("ABC");
        parkEntity.setCountry("Belgie");
        parkEntity.setProvince("Antwerpen");
        parkEntity.setStreet("Boomsesteenweg");
        parkEntity.setStreetnumber(10);
        objectsToSave.add(parkEntity);

        BungalowEntity BungalowEntity = new BungalowEntity();
        BungalowEntity.setName("abc");
        BungalowEntity.setCode("edf");
        BungalowEntity.setType("comfort");
        BungalowEntity.setDescription("Een bungalow");
        BungalowEntity.setMaxcustomers(4);
        BungalowEntity.setDishwasher(true);
        BungalowEntity.setJacuzzi(true);
        BungalowEntity.setSauna(true);
        BungalowEntity.setSunbed(true);
        BungalowEntity.setPark("ABC");
        objectsToSave.add(BungalowEntity);

        CustomerEntity CustomerEntity = new CustomerEntity();
        CustomerEntity.setEmail("Test@test.test");
        CustomerEntity.setPromotionpoints(100);
        CustomerEntity.setFirstname("Jos");
        CustomerEntity.setLastname("Vermeulen");
        CustomerEntity.setCellphone("0489563214");
        objectsToSave.add(CustomerEntity);

        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setStartDate("10/10/2012");
        reservationEntity.setStartTime("10:00");
        reservationEntity.setEndDate("12/10/2012");
        reservationEntity.setEndTime("11:00");
        reservationEntity.setCancellationInsurance(true);
        reservationEntity.setAmountCustomers(8);
        reservationEntity.setCustomerName("Jos Vermeulen");
        reservationEntity.setBungalowName("abc");
        objectsToSave.add(reservationEntity);

        for (Object objectToSave1 : objectsToSave) {
            em.persist(objectToSave1);
        }

        return parkEntity;
    }

}
