/*
 * Copyright (C) 2014 Pepijn Mores
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
package org.thomasmore.oo3.course.resortui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.dao.CustomerDao;

import org.thomasmore.oo3.course.resortui.entity.CustomerEntity;

import org.thomasmore.oo3.course.resortui.model.CustomerListDetailDto;
import org.thomasmore.oo3.course.resortui.model.CustomerPageDto;
import org.thomasmore.oo3.course.resortui.model.ParkListDetailDto;
import org.thomasmore.oo3.course.resortui.model.ParkPageDto;


/**
 *
 * @author Pepijn Mores
 */

public class CustomerController {
     private CustomerPageDto dto;
     @EJB
    private CustomerDao customerDao;
    @PostConstruct
    public void init() {
        List<CustomerEntity> parken = customerDao.listAll();
        dto = new CustomerPageDto();
        
        for (CustomerEntity customerEntity : customers) {
            CustomerListDetailDto listDetail = new CustomerListDetailDto();
            listDetail.setId(customerEntity.getId());
            listDetail.setName(customerEntity.getName());
            dto.getList().add(listDetail);
        }
       
    }

    public void add(){
        dto = new CustomerPageDto();
        CustomerEntity customerEntity = new CustomerEntity();
        CustomerListDetailDto listDetail = new CustomerListDetailDto();
        customerEntity.setName(listDetail.getName());
        customerDao.save(customerEntity);
    }
    
    

    public CustomerPageDto getDto() {
        return dto;
    }

    public void setDto(ParkPageDto dto) {
        this.dto = dto;
    }
    
}
