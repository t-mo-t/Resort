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
 * @author Stephan
 */

@Entity
@Table(name = "Type")
@XmlRootElement
public class TypeEntity extends BasicEntity{
    

   private String bungalowTypeOmschrijving;

    public String getBungalowTypeOmschrijving() {
        return bungalowTypeOmschrijving;
    }

    public void setBungalowTypeOmschrijving(String bungalowTypeOmschrijving) {
        this.bungalowTypeOmschrijving = bungalowTypeOmschrijving;
    }
        
}
