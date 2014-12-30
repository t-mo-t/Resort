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
package org.thomasmore.oo3.course.resortui.controller;

import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.dao.BungalowDao;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
import org.thomasmore.oo3.course.resortui.model.BungalowDetailDto;
import org.thomasmore.oo3.course.resortui.model.BungalowListDetailDto;

/**
 *
 * @author lucs
 */
@Named(value = "bungalow")
@RequestScoped
public class BungalowController {

    private BungalowPageDto dto;
    
    @EJB
    private BungalowDao BungalowDao;

    @PostConstruct
    public void init() {
        
        List<BungalowEntity> bungalowlist = BungalowDao.listAll();
        dto = new BungalowPageDto();
        
        /*
        for (int i = 0; i < 10; i++) {
            BungalowListDetailDto listDetail = new BungalowListDetailDto();
            listDetail.setId("@"+i);
            listDetail.setName("B"+(i+1));
            dto.getList().add(listDetail);
        }
        */
        
        for (BungalowEntity bungalow : bungalowlist) { 
            BungalowListDetailDto listDetail = new BungalowListDetailDto();
            listDetail.setId(bungalow.getId());
            listDetail.setName(bungalow.getName());
            dto.getList().add(listDetail);
        }
        
    }

    public void add(){
        dto.getDetail().setId("NEW");
        dto.getList().add(dto.getDetail());
    }
    
    public void remove(){
        dto.getDetail().getId();
        dto.getList().remove(dto.getDetail());
    }
    
    public void edit(){
        dto.getDetail().getId();
       
    }
    
    public BungalowPageDto getDto() {
        return dto;
    }

    public void setDto(BungalowPageDto dto) {
        this.dto = dto;
    }

}
