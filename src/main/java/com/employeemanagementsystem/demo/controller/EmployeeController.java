package com.employeemanagementsystem.demo.controller;

import com.employeemanagementsystem.demo.model.Employee;
import com.employeemanagementsystem.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EmployeeController {

    EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> listAllEmployeeFunctionality(){
    return employeeService.listAllEmployeeFunctionality();
    }

    @GetMapping("{employeeId}")
    public Employee viewByEmployeeId(@PathVariable long employeeId){
        return employeeService.viewByEmployeeId(employeeId);
    }

    @PostMapping
    public String createEmployeeFunctionality(@RequestBody Employee employee){
        employeeService.createEmployeeFunctionality(employee);
        return "Created Successfully";
    }
    @PutMapping
    public String updateEmployeeFunctionality(@RequestBody Employee employee){
        employeeService.updateEmployeeFunctionality(employee);
        return "Update Successfully";
    }
    @DeleteMapping("/{id}")
    public String deleteEmployeeFunctionality(@PathVariable long id){
        employeeService.deleteEmployeeFunctionality(id);
        return "delete";
    }
}
