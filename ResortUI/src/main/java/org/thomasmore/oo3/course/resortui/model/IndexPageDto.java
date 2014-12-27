package org.thomasmore.oo3.course.resortui.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;

public class IndexPageDto implements Serializable {

    private String name = "MyName";

    @PostConstruct
    public void init() {
        Date date = new Date();
        System.out.println("IndexPageDto - init");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
