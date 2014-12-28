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
package org.thomasmore.oo3.course.resortui.sample.ui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.thomasmore.oo3.course.resortui.model.BungalowListDetailDto;
import org.thomasmore.oo3.course.resortui.sample.business.entity.SampleBungalowEntity;
import org.thomasmore.oo3.course.resortui.sample.dao.SampleBungalowDao;

/**
 *
 * @author lucs
 */
@Named(value = "sampleBungalow")
@RequestScoped
public class SampleBungalowController {

	private BungalowPageDto dto;

	@EJB
	private SampleBungalowDao bungalowDao;

	@PostConstruct
	public void init() {
		dto = new BungalowPageDto();

		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String editId = req.getParameter("edit");

		SampleBungalowEntity sbe = bungalowDao.findById(editId);
		if (sbe != null) {
			dto.getDetail().setId(sbe.getId());
			dto.getDetail().setName(sbe.getName());
		}

		List<SampleBungalowEntity> bungalows = bungalowDao.listAll();
		

		for (SampleBungalowEntity bungalow : bungalows) {
			BungalowListDetailDto listDetail = new BungalowListDetailDto();
			listDetail.setId(bungalow.getId());
			listDetail.setName(bungalow.getName());
			dto.getList().add(listDetail);
		}

	}

	public String save() {
		String id = dto.getDetail().getId();
		SampleBungalowEntity sbe = null;
		if (id != null) {
			sbe = bungalowDao.findById(id);
		}
		if (sbe == null) {
			sbe = new SampleBungalowEntity();
		}
		sbe.setName(dto.getDetail().getName());
		bungalowDao.save(sbe);

		// Forces page refresh
		return "bungalow.xhtml??faces-redirect=true";
	}

	public BungalowPageDto getDto() {
		return dto;
	}

	public void setDto(BungalowPageDto dto) {
		this.dto = dto;
	}

}
