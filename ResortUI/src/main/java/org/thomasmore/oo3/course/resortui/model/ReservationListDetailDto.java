package org.thomasmore.oo3.course.resortui.model;

public class ReservationListDetailDto {
    private String id;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private Integer amountCustomers;
    private boolean cancellationInsurance;

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

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getAmountCustomers() {
        return amountCustomers;
    }

    public void setAmountCustomers(Integer amountCustomers) {
        this.amountCustomers = amountCustomers;
    }

    public boolean isCancellationInsurance() {
        return cancellationInsurance;
    }

    public void setCancellationInsurance(boolean cancellationInsurance) {
        this.cancellationInsurance = cancellationInsurance;
    }


    
}
