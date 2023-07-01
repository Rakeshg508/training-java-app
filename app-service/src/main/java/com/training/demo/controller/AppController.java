package com.training.demo.controller;

import com.training.demo.model.Employee;
import com.training.demo.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    private AppService appService;
    @GetMapping("message")
    public List<Employee> getMessage() {
       return appService.getEmployeeList();
    }
    @PostMapping("save")
    public Employee saveEmp(Employee employee) {
        return appService.saveEmp(employee);
    }
}
