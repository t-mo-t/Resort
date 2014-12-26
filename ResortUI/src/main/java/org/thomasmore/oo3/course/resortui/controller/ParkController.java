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

import java.util.Date;
import javax.annotation.PostConstruct;
import org.thomasmore.oo3.course.resortui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.BungalowDetailDto;
import org.thomasmore.oo3.course.resortui.model.BungalowListDetailDto;
import org.thomasmore.oo3.course.resortui.model.ParkListDetailDto;
import org.thomasmore.oo3.course.resortui.model.ParkPageDto;

/**
 *
 * @author lucs
 */
@Named(value = "park")
@RequestScoped
public class ParkController {

    private ParkPageDto dto;

    @PostConstruct
    public void init() {

        dto = new ParkPageDto();

        for (int i = 0; i < 10; i++) {
            ParkListDetailDto listDetail = new ParkListDetailDto();
            listDetail.setId("@" + i);
            listDetail.setName("P" + (i + 1));
            dto.getList().add(listDetail);
        }
    }

    public void add() {
        int i = dto.getList().size();
        ParkListDetailDto listDetail = new ParkListDetailDto();
        dto.getDetail().setId("@" + i);
        dto.getList().add(dto.getDetail());
    }

    public void delete() {

        dto.getList().remove(dto.getDetail());
    }

    public ParkPageDto getDto() {
        return dto;
    }

    public void setDto(ParkPageDto dto) {
        this.dto = dto;
    }

}
