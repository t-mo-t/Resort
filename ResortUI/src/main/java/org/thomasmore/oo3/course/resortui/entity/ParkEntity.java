
package org.thomasmore.oo3.course.resortui.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "park")
@XmlRootElement
public class ParkEntity extends BasicEntity{
    @OneToMany(targetEntity=BungalowEntity.class,fetch = FetchType.LAZY, mappedBy = "park")
    private List<BungalowEntity> bungalow;

   private String name;
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
}
