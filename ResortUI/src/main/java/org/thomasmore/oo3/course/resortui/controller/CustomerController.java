package org.thomasmore.oo3.course.resortui.controller;

import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.model.CustomerPageDto;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.thomasmore.oo3.course.resortui.doa.CustomerDao;
import org.thomasmore.oo3.course.resortui.entity.CustomerEntity;
import org.thomasmore.oo3.course.resortui.model.CustomerDetailDto;
import org.thomasmore.oo3.course.resortui.model.CustomerListDetailDto;

/**
 *
 * @author lucs
 */
@Named(value = "customer")
@RequestScoped
public class CustomerController {

    private CustomerPageDto dto;

    @EJB
    private CustomerDao customerDao;

    @PostConstruct
    public void init() {

        List<CustomerEntity> customers = customerDao.listAll();
        dto = new CustomerPageDto();
        //code voor editHttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();

        for (CustomerEntity customer : customers) {
            CustomerListDetailDto listDetail = new CustomerListDetailDto();
            listDetail.setId(customer.getId());
            listDetail.setName(customer.getName());
            dto.getList().add(listDetail);
        }
    }

    public void add() {
        dto.getDetail().setId("NEW");
        dto.getList().add(dto.getDetail());
    }

    public CustomerPageDto getDto() {
        return dto;
    }

    public void setDto(CustomerPageDto dto) {
        this.dto = dto;
    }
    
    public void remove(){
        dto.getList().remove(dto.getDetail());
    }

}