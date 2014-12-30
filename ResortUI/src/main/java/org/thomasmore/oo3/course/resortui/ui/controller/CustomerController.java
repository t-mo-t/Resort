

package org.thomasmore.oo3.course.resortui.ui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.ui.model.CustomerPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.ui.model.CustomerListDetailDto;
import org.thomasmore.oo3.course.resortui.entity.CustomerEntity;
import org.thomasmore.oo3.course.resortui.dao.CustomerDao;

/**
 *
 * @author lucs
 */
@Named(value = "Customer")

@RequestScoped
public class CustomerController {

       private CustomerPageDto dto;

    @EJB
    private CustomerDao CustomerDao;
    
    @PostConstruct
    public void init() {
        
        List<CustomerEntity> Customers = CustomerDao.listAll();
        dto = new CustomerPageDto();
        
     for (CustomerEntity Customer : Customers) {
            CustomerListDetailDto listDetail = new CustomerListDetailDto();
            listDetail.setId(Customer.getId());
            listDetail.setLastName(Customer.getLastName());
            listDetail.setFirstName(Customer.getFirstName());
            listDetail.setBirthdate(Customer.getBirthdate());
            listDetail.setPassword(Customer.getPassword());
            listDetail.setSex(Customer.getSex());
            listDetail.setUsername(Customer.getUsername());
            
            dto.getList().add(listDetail);
        }
       
    }

    public void add(){
        dto.getDetail().setId("NEW");
        dto.getList().add(dto.getDetail());
    }
    
    

    public CustomerPageDto getDto() {
        return dto;
    }

    public void setDto(CustomerPageDto dto) {
        this.dto = dto;
    }
}
