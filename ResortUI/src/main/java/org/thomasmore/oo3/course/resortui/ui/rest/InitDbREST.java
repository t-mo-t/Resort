/*
 * Copyright (C) 2014 lucs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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

/**
 *
 * @author lucs
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
        
        CustomerEntity CustomerEntity= new CustomerEntity();
        CustomerEntity.setEmail("Test@test.test");
        CustomerEntity.setPromotionpoints(100);
        CustomerEntity.setFirstname("Jos");
        CustomerEntity.setLastname("Vermeulen");
        CustomerEntity.setCellphone("0489563214");
        objectsToSave.add(CustomerEntity);
        
        for (Object objectToSave1 : objectsToSave){
            em.persist(objectToSave1);
        }
        

        return parkEntity;
    }

}