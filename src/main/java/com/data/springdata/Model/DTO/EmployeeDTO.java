package com.data.springdata.Model.DTO;


import com.data.springdata.Model.Entity.Employee;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private  int id;
    private  String firstname;
    private  String lastname;
    private double Salary;


public static  EmployeeDTO toDto(Employee entity){
    return  EmployeeDTO .builder()
            .id(entity.getId())
            .firstname(entity.getFirstname())
            .lastname(entity.getLastname())
            .Salary(entity.getSalary())
            .build();
}


}
