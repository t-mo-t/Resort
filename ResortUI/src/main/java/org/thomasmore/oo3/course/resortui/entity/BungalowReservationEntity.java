
package org.thomasmore.oo3.course.resortui.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Stephan
 */

@Entity
@Table(name = "BungalowReservation")
@XmlRootElement

public class BungalowReservationEntity extends BasicEntity{
    

   private String name;
   
   private int bungalowReservationId;
   
   private int reservationId;
   
   private int bungalowid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBungalowReservationId() {
        return bungalowReservationId;
    }

    public void setBungalowReservationId(int bungalowReservationId) {
        this.bungalowReservationId = bungalowReservationId;
    }



    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getBungalowid() {
        return bungalowid;
    }

    public void setBungalowid(int bungalowid) {
        this.bungalowid = bungalowid;
    }
  

    
}
