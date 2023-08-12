package com.employee.employee.controller;

import com.employee.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("newemployee")
    public String newemployee(){
        System.out.println("/getinvoked-newemployee");
        return employeeService.newemployee();
    }

    @GetMapping("multiple-employee")
    public List<String>newemploye(){
        System.out.println("/getinvoked-multiple-employee");
        return employeeService.newemployee(10);
    }
}
