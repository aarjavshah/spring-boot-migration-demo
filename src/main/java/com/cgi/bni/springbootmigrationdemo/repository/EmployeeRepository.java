package com.cgi.bni.springbootmigrationdemo.repository;

import com.cgi.bni.springbootmigrationdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
