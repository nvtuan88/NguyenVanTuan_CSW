package com.demo.employee.service;

import com.demo.employee.entity.EmployeeEntity;
import com.demo.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceIpml implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity employee =employeeRepository.save(employeeEntity);
        return employee;
    }

    @Override
    public EmployeeEntity getByid(int id) {
        return employeeRepository.findById(id).get();
    }


}
