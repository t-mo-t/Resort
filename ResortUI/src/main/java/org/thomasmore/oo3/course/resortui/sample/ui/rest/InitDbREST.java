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
package org.thomasmore.oo3.course.resortui.sample.ui.rest;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
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
import org.thomasmore.oo3.course.resortui.entity.BungalowDao;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
import org.thomasmore.oo3.course.resortui.entity.ParkDao;
import org.thomasmore.oo3.course.resortui.entity.ParkEntity;

/**
 *
 * @author lucs
 */
@Stateless
@Path("init-db")
public class InitDbREST {

    private boolean isLoaded=false;
    
    @EJB
    private ParkDao parkdao;
    
    @EJB
    private BungalowDao bungalowdao;
    
    @PersistenceContext(unitName = "RESORTPU")
    private EntityManager em;
    

    @GET
    @Produces({"application/json", "application/xml"})
    public void init() {
        List<ParkEntity> objectsToSave = new LinkedList<>();

        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setName("ABC");
        objectsToSave.add(parkEntity);
        
        parkEntity = new ParkEntity();
        parkEntity.setName("EDF");
        objectsToSave.add(parkEntity);

        /*for(int i=0;i<10;i++){
            BungalowEntity bungalowEntity = new BungalowEntity();
            bungalowEntity.setName("abc"+(i+1));
            bungalowEntity.setId((i+1)+"");
            objectsToSave.add(bungalowEntity);
        }
        */

        for (ParkEntity objectsToSave1 : objectsToSave) {
            parkdao.save(objectsToSave1);
            
        }
        em.clear();
        em.close();
    }
    
    public ParkDao getparkdao(){
        return this.parkdao;
    }
    
    public Boolean dbIsLoaded(){
        return this.isLoaded;
    }

}
