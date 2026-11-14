package com.jayaharsha.employee_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer employeeId;
    private String name;
    private String email;
    private String designation;
    private String department;
    private BigDecimal salary;
    private LocalDate joiningDate;

}
