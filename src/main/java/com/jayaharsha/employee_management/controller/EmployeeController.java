package com.jayaharsha.employee_management.controller;
import com.jayaharsha.employee_management.model.Employee;
import com.jayaharsha.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
        boolean result = employeeService.saveEmployee(employee);

        if(result){
            return ResponseEntity.ok("Employee saved successfully");
        } else {
            return ResponseEntity.status(500).body("Failed to save employee");
        }
    }
}
