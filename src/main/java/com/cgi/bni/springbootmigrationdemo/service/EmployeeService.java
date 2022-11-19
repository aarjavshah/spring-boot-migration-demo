package com.cgi.bni.springbootmigrationdemo.service;

import com.cgi.bni.springbootmigrationdemo.exception.EmployeeNotFoundException;
import com.cgi.bni.springbootmigrationdemo.model.Employee;
import com.cgi.bni.springbootmigrationdemo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(EmployeeNotFoundException::new);
    }

}
