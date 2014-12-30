
package org.thomasmore.oo3.course.resortui.ui.model;

import java.sql.Date;


public class CustomerListDetailDto {
    
   private String id;
   private String FirstName;
   private String LastName;
   private String Sex;
   private Date Birthdate;
   private String Password;
   private String Username;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

   
    
}
