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
@Table(name = "BungalowType")
@XmlRootElement

public class BungalowTypeEntity extends BasicEntity {
    
    private int BungalowTypeID;
    private int ParkID;
    private int BungalowCapacity;
    private boolean Hottub;
    private boolean Sauna;
    private boolean Solarium;
    private boolean Dishwasher;

    public int getBungalowTypeID() {
        return BungalowTypeID;
    }

    public void setBungalowTypeID(int BungalowTypeID) {
        this.BungalowTypeID = BungalowTypeID;
    }

    public int getParkID() {
        return ParkID;
    }

    public void setParkID(int ParkID) {
        this.ParkID = ParkID;
    }

    public int getBungalowCapacity() {
        return BungalowCapacity;
    }

    public void setBungalowCapacity(int BungalowCapacity) {
        this.BungalowCapacity = BungalowCapacity;
    }

    public boolean isHottub() {
        return Hottub;
    }

    public void setHottub(boolean Hottub) {
        this.Hottub = Hottub;
    }

    public boolean isSauna() {
        return Sauna;
    }

    public void setSauna(boolean Sauna) {
        this.Sauna = Sauna;
    }

    public boolean isSolarium() {
        return Solarium;
    }

    public void setSolarium(boolean Solarium) {
        this.Solarium = Solarium;
    }

    public boolean isDishwasher() {
        return Dishwasher;
    }

    public void setDishwasher(boolean Dishwasher) {
        this.Dishwasher = Dishwasher;
    }
    
    
    
    
}
