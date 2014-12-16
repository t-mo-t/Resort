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
package org.thomasmore.oo3.course.resortui.model;

/**
 *
 * @author raf
 */
public class BungalowListDetailDto {
    
    private String id;
    
    private String name;
    private String code;
    private Integer maxCustomers;
    private boolean hotTub;
    private boolean sauna;
    private boolean dishwasher;
    private boolean sunbed;
    private String description;
    private String type;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getMaxcustomers() {
        return maxCustomers;
    }
    public void setMaxcustomers(Integer maxcustomers) {
        this.maxCustomers = maxcustomers;
    }
    public boolean isHotTub() {
        return hotTub;
    }
    public void setHotTub(boolean HotTub) {
        this.hotTub = hotTub;
    }
    public boolean isSauna() {
        return sauna;
    }
    public void setSauna(boolean sauna) {
        this.sauna = sauna;
    }
    public boolean isDishwasher() {
        return dishwasher;
    }
    public void setDishwasher(boolean dishwasher) {
        this.dishwasher = dishwasher;
    }
    public boolean isSunbed() {
        return sunbed;
    }
    public void setSunbed(boolean sunbed) {
        this.sunbed = sunbed;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
