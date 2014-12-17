package org.thomasmore.oo3.course.resortui.sample.business.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.thomasmore.oo3.course.resortui.entity.BasicEntity;

@Entity
@Table(name = "Customer")
@XmlRootElement
public class CustomerEntity extends BasicEntity {

    private String email;
    private Integer promotionpoints;
    private String firstname;
    private String lastname;
    private String cellphone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPromotionpoints() {
        return promotionpoints;
    }

    public void setPromotionpoints(Integer promotionpoints) {
        this.promotionpoints = promotionpoints;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    
    
}
