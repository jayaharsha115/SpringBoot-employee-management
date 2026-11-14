package com.jayaharsha.employee_management.repository;
import com.jayaharsha.employee_management.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save( Employee employee) {
        String sql = "INSERT INTO employees (name, email, designation, department, salary, joining_date) VALUES ( ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, employee.getName(), employee.getEmail(), employee.getDesignation(), employee.getDepartment(), employee.getSalary(), employee.getJoiningDate());
    }
}
