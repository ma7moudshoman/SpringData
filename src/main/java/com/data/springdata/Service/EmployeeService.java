package com.data.springdata.Service;

import com.data.springdata.Model.DTO.EmployeeDTO;
import com.data.springdata.Model.Entity.Employee;
import com.data.springdata.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeDTO getUser(int id){
        Optional<Employee> employee=employeeRepo.findById(id);
        if ((employee.isPresent()))
            return EmployeeDTO.toDto(employee.get());
else
    return null;

    }

    public List<Employee>getAllUsers(){
        return employeeRepo.findAll();
    }
    public EmployeeDTO UpdateEmployee(EmployeeDTO employee){
       return EmployeeDTO.toDto( employeeRepo.save(Employee.toEntity(employee)));
    }

    public void deleteEmployee(int id){
        employeeRepo.deleteById(id);

    }


}
