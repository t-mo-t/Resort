/*
 * Copyright (C) 2014 Arne
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

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Arne
 */

@Entity
@Table(name = "Customer")
@XmlRootElement

public class CustomerEntity extends BasicEntity {
    
    private int CustomerID;
    private String CustomerName;
    private String CustomerLastName;
    private String CustomerStreet;
    private String CustomerTown;
    private int CustomerPostalCode;
    private int CustomerStreetNumber;
    private String CustomerPhone;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerLastName() {
        return CustomerLastName;
    }

    public void setCustomerLastName(String CustomerLastName) {
        this.CustomerLastName = CustomerLastName;
    }

    public String getCustomerStreet() {
        return CustomerStreet;
    }

    public void setCustomerStreet(String CustomerStreet) {
        this.CustomerStreet = CustomerStreet;
    }

    public String getCustomerTown() {
        return CustomerTown;
    }

    public void setCustomerTown(String CustomerTown) {
        this.CustomerTown = CustomerTown;
    }

    public int getCustomerPostalCode() {
        return CustomerPostalCode;
    }

    public void setCustomerPostalCode(int CustomerPostalCode) {
        this.CustomerPostalCode = CustomerPostalCode;
    }

    public int getCustomerStreetNumber() {
        return CustomerStreetNumber;
    }

    public void setCustomerStreetNumber(int CustomerStreetNumber) {
        this.CustomerStreetNumber = CustomerStreetNumber;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }
    
    
    
}
