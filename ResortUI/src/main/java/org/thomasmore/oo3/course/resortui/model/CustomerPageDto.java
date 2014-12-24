package org.thomasmore.oo3.course.resortui.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jasper & Nico
 */
public class CustomerPageDto {

    private CustomerDetailDto detail = new CustomerDetailDto();

    private List<CustomerListDetailDto> list = new LinkedList<>();

    public CustomerDetailDto getDetail() {
        return detail;
    }

    public void setDetail(CustomerDetailDto detail) {
        this.detail = detail;
    }

    public List<CustomerListDetailDto> getList() {
        return list;
    }

    public void setList(List<CustomerListDetailDto> list) {
        this.list = list;
    }

}
