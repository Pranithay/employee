package com.example.employee.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/employees")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployees() {

        return employeeService.getEmployees();
    }

    @PostMapping()
    public void postEmployee(@RequestBody Employee employee){
        employeeService.addNishanth(employee);
    }
    @DeleteMapping(path = "{id}")
    public void deleEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

}
