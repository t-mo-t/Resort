
package org.thomasmore.oo3.course.resortui.ui.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.ui.model.LoginDto;
import org.thomasmore.oo3.course.resortui.ui.model.SessionDto;

/**
 *
 * @author lucs
 */
//@Named(value = "test2")
@RequestScoped
public class LoginController {

    private LoginDto dto;

    @Inject
    private SessionDto sessionDto;

    @PostConstruct
    public void init() {
        dto = new LoginDto();
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml?faces-redirect=true";
    }

    public String login() {
        if (dto.getName().startsWith("a")) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            FacesMessage facesMessage = new FacesMessage("Invalid login - Can't start with [a]");
            facesContext.addMessage(null, facesMessage);
            return null;
        }
        sessionDto.getUserDto().setFname("Jhon");
        sessionDto.getUserDto().setLname("Doe");
        sessionDto.getUserDto().setLoggedIn(true);
        return "index.xhtml";
    }

    public LoginDto getDto() {
        return dto;
    }

    public void setDto(LoginDto dto) {
        this.dto = dto;
    }

}
