package org.thomasmore.oo3.course.resortui.model;

public class BungalowListDetailDto {
    
    private String id;
    
    private String name;
    private String code;
    private Integer maxcustomers;
    private boolean jacuzzi;
    private boolean sauna;
    private boolean dishwasher;
    private boolean sunbed;
    private String description;
    private String type;
    private String park;
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
        return maxcustomers;
    }

    public void setMaxcustomers(Integer maxcustomers) {
        this.maxcustomers = maxcustomers;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
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

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }
    
}
