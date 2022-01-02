package com.example.employee.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        /*Employee employee = new Employee(
                1l,
                "Nishanth",
                "nishanth@144.com",
                "testing"
        );
        Employee employee1 = new Employee(
                2l,
                "pranitha",
                "pranitha@gmail.com",
                "dev"
        );
        List<Employee> list = new ArrayList<Employee>();
        list.add(employee);
        list.add(employee1);
        return  list;*/
        return employeeRepository.findAll();
    }

    public void addNishanth(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
