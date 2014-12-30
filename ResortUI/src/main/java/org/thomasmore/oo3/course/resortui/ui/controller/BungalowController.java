

package org.thomasmore.oo3.course.resortui.ui.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.thomasmore.oo3.course.resortui.ui.model.BungalowPageDto;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.thomasmore.oo3.course.resortui.ui.model.BungalowListDetailDto;
import org.thomasmore.oo3.course.resortui.entity.BungalowEntity;
import org.thomasmore.oo3.course.resortui.dao.BungalowDao;

/**
 *
 * @author lucs
 */
@Named(value = "Bungalow")

@RequestScoped
public class BungalowController {

       private BungalowPageDto dto;

	@EJB
	private BungalowDao bungalowDao;

	@PostConstruct
	public void init() {
		dto = new BungalowPageDto();

		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String editId = req.getParameter("edit");

		BungalowEntity sbe = bungalowDao.findById(editId);
		if (sbe != null) {
			dto.getDetail().setId(sbe.getId());
			dto.getDetail().setName(sbe.getName());
		}

		List<BungalowEntity> bungalows = bungalowDao.listAll();
		

		for (BungalowEntity bungalow : bungalows) {
			BungalowListDetailDto listDetail = new BungalowListDetailDto();
			listDetail.setId(bungalow.getId());
			listDetail.setName(bungalow.getName());
			dto.getList().add(listDetail);
		}

	}

	public String save() {
		String id = dto.getDetail().getId();
		BungalowEntity sbe = null;
		if (id != null) {
			sbe = bungalowDao.findById(id);
		}
		if (sbe == null) {
			sbe = new BungalowEntity();
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
