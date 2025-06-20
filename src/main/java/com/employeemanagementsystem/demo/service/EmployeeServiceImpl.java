package com.employeemanagementsystem.demo.service;

import com.employeemanagementsystem.demo.model.Employee;
import org.springframework.stereotype.Service;
import com.employeemanagementsystem.demo.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String createEmployeeFunctionality(Employee employee) {
        employeeRepository.save(employee);
        return "Created Successfully";
    }

    @Override
    public String updateEmployeeFunctionality(Employee employee) {
        employeeRepository.save(employee);
        return "Update";
    }

    @Override
    public String deleteEmployeeFunctionality(long employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Delete";
    }

    @Override
    public List<Employee> listAllEmployeeFunctionality() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee viewByEmployeeId(long employeeId) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        if(!optionalEmployee.isEmpty())
        {
            Employee employee = optionalEmployee.get();
            return employee;
        }
        return null;
    }
}
