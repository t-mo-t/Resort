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
@Table(name = "BungalowReservation")
@XmlRootElement

public class BungalowReservationEntity extends BasicEntity{
    
    private int BungalowReservationID;
    private int ReservationID;
    private int BungalowID;

    public int getBungalowReservationID() {
        return BungalowReservationID;
    }

    public void setBungalowReservationID(int BungalowReservationID) {
        this.BungalowReservationID = BungalowReservationID;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public int getBungalowID() {
        return BungalowID;
    }

    public void setBungalowID(int BungalowID) {
        this.BungalowID = BungalowID;
    }
    
    
    
}
