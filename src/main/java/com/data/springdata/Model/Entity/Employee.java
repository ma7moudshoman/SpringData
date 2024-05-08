package com.data.springdata.Model.Entity;

import com.data.springdata.Model.DTO.EmployeeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private  int id;
    @Column(name = "Firstname")
    private  String firstname;
    @Column(name = "Lastname")
    private  String lastname;
    @Column(name = "salary")
    private double Salary;

    public static Employee toEntity(EmployeeDTO dto){
        return Employee.builder()
                .id(dto.getId())
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .Salary(dto.getSalary())
                .build();
    }




}
