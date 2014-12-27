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
@Table(name = "Reservation")
@XmlRootElement

public class ReservationEntity extends BasicEntity {
    
    private int ReservationID;
    private int StartDate;
    private int EndDate;
    private int StartTime;
    private int EndTime;
    private boolean CancellationInsurance;
    private int NumberOfPersons;

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public int getStartDate() {
        return StartDate;
    }

    public void setStartDate(int StartDate) {
        this.StartDate = StartDate;
    }

    public int getEndDate() {
        return EndDate;
    }

    public void setEndDate(int EndDate) {
        this.EndDate = EndDate;
    }

    public int getStartTime() {
        return StartTime;
    }

    public void setStartTime(int StartTime) {
        this.StartTime = StartTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public void setEndTime(int EndTime) {
        this.EndTime = EndTime;
    }

    public boolean isCancellationInsurance() {
        return CancellationInsurance;
    }

    public void setCancellationInsurance(boolean CancellationInsurance) {
        this.CancellationInsurance = CancellationInsurance;
    }

    public int getNumberOfPersons() {
        return NumberOfPersons;
    }

    public void setNumberOfPersons(int NumberOfPersons) {
        this.NumberOfPersons = NumberOfPersons;
    }
    
    
}
