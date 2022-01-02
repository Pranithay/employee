package com.example.employee.employee;

public class Employee {
    private Long id;
    private String name;
    private String email;
    private String dept;

    public Employee() {
    }

    public Employee(String name, String email, String dept) {
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public Employee(Long id, String name, String email, String dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
