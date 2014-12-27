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

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucs
 */
@Entity
@Table(name = "Bungalow")
@XmlRootElement

public class BungalowEntity extends BasicEntity {
    

   private String name;
   private String BungalowFancyName;
   private int BungalowTypeID;
   private int ParkID;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBungalowFancyName() {
        return BungalowFancyName;
    }

    public void setBungalowFancyName(String BungalowFancyName) {
        this.BungalowFancyName = BungalowFancyName;
    }

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
    
   
    
}
