package com.employee.employee.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class EmployeeHelper {
    public String employeeId(){

     String id=UUID.randomUUID().toString();
     return   id;
    }
}
