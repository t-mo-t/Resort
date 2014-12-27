
package org.thomasmore.oo3.course.resortui.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "bungalow")
@XmlRootElement
public class BungalowEntity extends BasicEntity{
    
   private String name;
   
   private int bungalowCode;
   
   private String fancyName;
   
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBungalowCode() {
        return bungalowCode;
    }

    public void setBungalowCode(int bungalowCode) {
        this.bungalowCode = bungalowCode;
    }

    public String getFancyName() {
        return fancyName;
    }

    public void setFancyName(String fancyName) {
        this.fancyName = fancyName;
    }
   
    
}
