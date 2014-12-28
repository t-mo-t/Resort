package org.thomasmore.oo3.course.resortui.controller;

import java.util.List;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.CustomerListDetailDto;
import org.thomasmore.oo3.course.resortui.model.CustomerPageDto;
import org.thomasmore.oo3.course.resortui.entity.CustomerEntity;
import org.thomasmore.oo3.course.resortui.dao.CustomerDao;

@Named(value = "customer")
@RequestScoped
public class CustomerController {

    private CustomerPageDto dto;
    @EJB
    private CustomerDao customersDao;

    @PostConstruct
    public void init() {
        List<CustomerEntity> customers = customersDao.listAll();
        dto = new CustomerPageDto();
        for (CustomerEntity customer : customers) {
            CustomerListDetailDto listDetail = new CustomerListDetailDto();
            listDetail.setId(customer.getId());
            listDetail.setEmail(customer.getEmail());
            listDetail.setPromotionpoints(customer.getPromotionpoints());
            listDetail.setFirstname(customer.getFirstname());
            listDetail.setLastname(customer.getLastname());
            listDetail.setCellphone(customer.getCellphone());
            dto.getList().add(listDetail);
        }
    }

    public void add() {
        dto.getDetail().setId(UUID.randomUUID().toString());
        dto.getList().add(dto.getDetail());
        CustomerEntity customerentity = new CustomerEntity();
        customerentity.setId(dto.getDetail().getId());
        customerentity.setFirstname(dto.getDetail().getFirstname());
        customerentity.setLastname(dto.getDetail().getLastname());
        customerentity.setEmail(dto.getDetail().getEmail());
        customerentity.setCellphone(dto.getDetail().getCellphone());
        customerentity.setPromotionpoints(dto.getDetail().getPromotionpoints());
        customersDao.save(customerentity);
    }

    public void remove() {
        String id = dto.getDetail().getId();
        CustomerListDetailDto removeFromListobject = new CustomerListDetailDto();
        for (CustomerListDetailDto customerListDetailDto : dto.getList()) {
            if (customerListDetailDto.getId().equals(id)) {
                removeFromListobject = customerListDetailDto;
            }

        }
        dto.getList().remove(removeFromListobject);
        customersDao.deleteById(id);
    }

    public CustomerPageDto getDto() {
        return dto;
    }

    public void setDto(CustomerPageDto dto) {
        this.dto = dto;
    }

}
