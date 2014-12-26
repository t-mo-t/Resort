
package org.thomasmore.oo3.course.resortui.business.entity;
/*@Entity                                       
@Table(name = "bungalow")
@XmlRootElement*/

public class BungalowEntity  {
    
   private String id;
   private String name;
    
    public String getId() {
        return id;
    }
  

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
}
