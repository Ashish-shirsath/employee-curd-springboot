package com.employeemanagementsystem.demo.service;

import com.employeemanagementsystem.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    public String createEmployeeFunctionality(Employee employee);
    public String updateEmployeeFunctionality(Employee employee);
    public String deleteEmployeeFunctionality(long employeeId);
    public List<Employee> listAllEmployeeFunctionality();
    public Employee viewByEmployeeId(long employeeId);

}
