/*
 * Copyright (C) 2014 lucs
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
import java.util.Set;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucs
 */
@Entity
@AttributeOverride( name="id", column = @Column(name="PARK_ID") )
@Table(name = "park")
@XmlRootElement
public class ParkEntity extends BasicEntity implements Serializable{
    
    private String name;
    
    private String address;
    //private Set<BungalowEntity> bungalows;
    
    @OneToMany
    @JoinTable(
            name="bungalow",
            joinColumns = @JoinColumn( name="PARK_ID"),
            inverseJoinColumns = @JoinColumn( name="BUNGALOW_ID")
    )
    /*public Set<BungalowEntity> getBungalows(){
        return this.bungalows;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
