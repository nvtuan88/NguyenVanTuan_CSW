package com.demo.employee.controller;

import com.demo.employee.entity.EmployeeEntity;
import com.demo.employee.model.BaseRespon;
import com.demo.employee.service.EmployeeService;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping
    public BaseRespon getEmployees(@RequestParam Map<String, String> params) {
        BaseRespon res = new BaseRespon();
        String id = params.get("id");
        if (id != null) {
            res.data = employeeService.getByid(Integer.parseInt(id));
        } else {
            res.data = employeeService.getAll();
        }
        return res;
    }

    @PostMapping
    public BaseRespon addEmployees(@RequestBody EmployeeEntity e) {
        BaseRespon res = new BaseRespon();
        res.data = employeeService.addEmployee(e);
        return res;
    }

    @PutMapping
    public BaseRespon updateEmployees(@RequestBody EmployeeEntity e) {
        BaseRespon res = new BaseRespon();
        res.data = employeeService.updateEmployee(e);
        return res;
    }


}
