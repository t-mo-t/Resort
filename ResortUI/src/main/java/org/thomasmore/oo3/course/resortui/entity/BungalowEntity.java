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

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

/**
 *
 * @author Stephan
 */
@Entity
@Table(name = "bungalow")
@XmlRootElement
public class BungalowEntity extends BasicEntity implements Serializable {
    
    private String name;
    private ParkEntity park;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARK_ID", nullable = false)
    public ParkEntity getPark() {
        return this.park;
    }
   
    public void setPark(ParkEntity park){
        this.park=park;
    }
    
   
    @Column(name = "BUNGALOW_NAAM")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}