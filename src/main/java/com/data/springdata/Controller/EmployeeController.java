package com.data.springdata.Controller;

import com.data.springdata.Model.Employee;
import com.data.springdata.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/Employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/fidUserById")
    public Optional<Employee> getUser(@RequestParam int id){
        return employeeService.getUser(id);
    }
    @PostMapping("/sava")
    public void save(@RequestBody Employee employee){
        employeeService.UpdateEmployee(employee);
    }
    @GetMapping("/Allusers")
    public List<Employee>allEmployees(){
        return employeeService.getAllUsers();
    }

    @GetMapping("/DeleteUser")
    public Employee deleteEmployee(@RequestParam int id){
         employeeService.deleteEmployee(id);
        return null;
    }
}
