package com.training.demo.service;

import com.training.demo.model.Employee;
import com.training.demo.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    private AppRepository appRepository;
    public List<Employee> getEmployeeList() {
       return appRepository.findAll();
    }

    public Employee saveEmp(Employee employee) {
        return appRepository.saveEmp(employee);
    }
}
