package com.manojll.departmentservice.controller;

import com.manojll.departmentservice.client.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    EmployeeClient employeeClient;
    @GetMapping
    public String getDepartment(){
        return "department";
    }

    @GetMapping("/emp")
    public String getDepartmentEmployees(){
        return employeeClient.getEmployee();
    }
}