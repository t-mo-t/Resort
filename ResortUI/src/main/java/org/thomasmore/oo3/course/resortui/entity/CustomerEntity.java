
package org.thomasmore.oo3.course.resortui.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Stephan
 */

@Entity
@Table(name = "Customer")
@XmlRootElement
public class CustomerEntity extends BasicEntity{
    

   private String FirstName;
   private String LastName;
   private String Sex;
   private Date Birthdate;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }
   


   
    
}
