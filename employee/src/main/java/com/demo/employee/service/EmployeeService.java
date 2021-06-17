package com.demo.employee.service;

import com.demo.employee.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll();
    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity getByid(int id);
}
