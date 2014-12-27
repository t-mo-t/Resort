/*
 * Copyright (C) 2014 Stephan
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
public class Customer extends BasicEntity{
    

   private String name;
   private String FirstName;
   private String Sex;
   private Date Birthdate;

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
   
   
    


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
}
