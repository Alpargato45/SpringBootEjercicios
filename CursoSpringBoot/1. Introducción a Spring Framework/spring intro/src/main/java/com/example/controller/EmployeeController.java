package com.example.controller;

import com.example.primary.CustomerService;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    public String helloFromEmployee() {
        return this.employeeService.hello();
    }

    public String helloFromCustomer() {
        return this.customerService.hello();
    }
}
