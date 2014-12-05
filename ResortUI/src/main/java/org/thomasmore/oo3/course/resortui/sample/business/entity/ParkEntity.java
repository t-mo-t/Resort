package org.thomasmore.oo3.course.resortui.sample.business.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jasper & Nico
 */
@Entity
@Table(name = "park")
@XmlRootElement

public class ParkEntity extends BasicEntity {

    private String id;
    private String name;
    private String parkAddress;

    private String holidayStartDate; // String since date/time/datetime were not available
    private String holidayEndDate;

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

    public String getParkAddress() {
        return parkAddress;
    }

    public void setParkAddress(String parkAddress) {
        this.parkAddress = parkAddress;
    }

    public String getHolidayStartDate() {
        return holidayStartDate;
    }

    public void setHolidayStartDate(String holidayStartDate) {
        this.holidayStartDate = holidayStartDate;
    }

    public String getHolidayEndDate() {
        return holidayEndDate;
    }

    public void setHolidayEndDate(String holidayEndDate) {
        this.holidayEndDate = holidayEndDate;
    }

}