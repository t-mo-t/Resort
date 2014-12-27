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
@Table(name = "Park")
@XmlRootElement

public class ParkEntity extends BasicEntity {
    
   private String ParkName;
   private String ParkClosureStart;
   private String ParkClosureEnd;
   
    

    public String getName() {
        return ParkName;
    }

    public void setName(String name) {
        this.ParkName = name;
    }

    public String getParkName() {
        return ParkName;
    }

    public void setParkName(String ParkName) {
        this.ParkName = ParkName;
    }

    public String getParkClosureStart() {
        return ParkClosureStart;
    }

    public void setParkClosureStart(String ParkClosureStart) {
        this.ParkClosureStart = ParkClosureStart;
    }

    public String getParkClosureEnd() {
        return ParkClosureEnd;
    }

    public void setParkClosureEnd(String ParkClosureEnd) {
        this.ParkClosureEnd = ParkClosureEnd;
    }
   
    
}
