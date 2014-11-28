package org.thomasmore.oo3.course.resortui.sample.business.entity;

/**
 *
 * @author Jasper & Nico
 */
public class ReservationEntity {
    
    private String id;
    private String startDate; // Time or Datetime doesn't exist.
    private String startTime;
    private String endTime;
    private String endDate;

    private boolean insurance; 
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    
}
