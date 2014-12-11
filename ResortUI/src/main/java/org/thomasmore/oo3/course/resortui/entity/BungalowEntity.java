package org.thomasmore.oo3.course.resortui.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "bungalow")
@XmlRootElement
public class BungalowEntity extends BasicEntity{

    private String name;
    private int maxCapacity;
    private int luxury; // int incase we want to make an average
    private String code;

    private boolean hotTub;
    private boolean sauna;
    private boolean solarium;
    private boolean dishWasher;

    private String details;
    private int amtPeoplePresent;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getLuxury() {
        return luxury;
    }

    public void setLuxury(int luxury) {
        this.luxury = luxury;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isHotTub() {
        return hotTub;
    }

    public void setHotTub(boolean hotTub) {
        this.hotTub = hotTub;
    }

    public boolean isSauna() {
        return sauna;
    }

    public void setSauna(boolean sauna) {
        this.sauna = sauna;
    }

    public boolean isSolarium() {
        return solarium;
    }

    public void setSolarium(boolean solarium) {
        this.solarium = solarium;
    }

    public boolean isDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(boolean dishWasher) {
        this.dishWasher = dishWasher;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getAmtPeoplePresent() {
        return amtPeoplePresent;
    }

    public void setAmtPeoplePresent(int amtPeoplePresent) {
        this.amtPeoplePresent = amtPeoplePresent;
    }

}
