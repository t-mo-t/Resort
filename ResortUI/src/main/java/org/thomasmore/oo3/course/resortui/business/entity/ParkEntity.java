
package org.thomasmore.oo3.course.resortui.business.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Stephan
 */


/*@Entity                                       //misschien? ook bij bungalowentity aanpassen!
@Table(name = "park")
@XmlRootElement
*/
public class ParkEntity /*extends BasicEntity*/ {
    
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
