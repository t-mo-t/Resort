
package org.thomasmore.oo3.course.resortui.ui.model;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author lucs
 */
@Named
@SessionScoped
public class SessionDto implements Serializable{

    private UserDto userDto;

    @PostConstruct
    public void init() {
        System.out.println("SessionDto - init");
        userDto = new UserDto();
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto UserDto) {
        this.userDto = UserDto;
    }

}