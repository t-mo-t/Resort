
package org.thomasmore.oo3.course.resortui.business.entity;


/**
 *
 * @author Stephan
 */


/*@Entity                                       
@Table(name = "park")
@XmlRootElement*/

public class ParkEntity {
    
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
