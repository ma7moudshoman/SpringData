package com.data.springdata.Model;

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

}
