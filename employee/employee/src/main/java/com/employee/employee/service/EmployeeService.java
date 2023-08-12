package com.employee.employee.service;

import com.employee.employee.helper.EmployeeHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {
   @Autowired
  private EmployeeHelper employeeHelper;
    public String newemployee(){
       return employeeHelper.employeeId();
    }
    public List<String>newemployee(int quantity){
        List<String>newep=new ArrayList<>();
        for(int i=0;i<quantity;i++){
            String newemploy=employeeHelper.employeeId();
            newep.add(newemploy);
        }
        return newep;
    }
}
