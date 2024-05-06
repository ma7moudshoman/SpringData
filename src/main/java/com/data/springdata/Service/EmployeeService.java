package com.data.springdata.Service;

import com.data.springdata.Model.Employee;
import com.data.springdata.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Optional<Employee> getUser(int id){
     return   employeeRepo.findById(id);
    }

    public List<Employee>getAllUsers(){
        return employeeRepo.findAll();
    }
    public void UpdateEmployee(Employee employee){
        employeeRepo.save(employee);
    }

    public void deleteEmployee(int id){
        employeeRepo.deleteById(id);

    }


}
