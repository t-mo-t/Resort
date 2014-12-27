
package org.thomasmore.oo3.course.resortui.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "park")
@XmlRootElement
public class ParkEntity extends BasicEntity{
    

   private String name;
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
}
