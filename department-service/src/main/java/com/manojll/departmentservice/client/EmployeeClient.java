package com.manojll.departmentservice.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("/employees")
    public String getEmployee();
}
