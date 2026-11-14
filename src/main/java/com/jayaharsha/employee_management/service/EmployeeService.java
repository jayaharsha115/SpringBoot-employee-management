package com.jayaharsha.employee_management.service;

import com.jayaharsha.employee_management.model.Employee;
import com.jayaharsha.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public boolean saveEmployee(Employee employee) {
        int result = employeeRepository.save(employee);
        return result > 0;
    }
}
