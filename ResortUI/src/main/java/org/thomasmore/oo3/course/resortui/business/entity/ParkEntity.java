/*
 * Copyright (C) 2014 raf
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
package org.thomasmore.oo3.course.resortui.business.entity;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.thomasmore.oo3.course.resortui.entity.BasicEntity;

/**
 *
 * @author marnixvanlint
 */
@Entity
@Table(name = "park")
@XmlRootElement
public class ParkEntity extends BasicEntity{
  
    
    private String name;
    private int number;
    private String country;
    private Date closingFrom;
    private Date closingTill;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getClosingFrom() {
        return closingFrom;
    }

    public void setClosingFrom(Date closingFrom) {
        this.closingFrom = closingFrom;
    }

    public Date getClosingTill() {
        return closingTill;
    }

    public void setClosingTill(Date closingTill) {
        this.closingTill = closingTill;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    

 
    
}
