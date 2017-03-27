package com.kiranreddykasa.service;
 
import com.kiranreddykasa.domain.Employee;
import com.kiranreddykasa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import java.util.List;
 
/**
 * Created by kiran on 4/13/2015.
 */
@Service
@Transactional
public class EmployeeService {
 
    @Autowired
    private EmployeeRepository employeeRepository;
 
 
    public void deleteEmployee(Employee employee) {
 
        employeeRepository.delete(employee);
    }
 
    public Employee findEmployee(Long id) {
 
        return employeeRepository.findOne(id);
    }
 
    public List<Employee> findAllEmployees() {
 
        return employeeRepository.findAll();
    }
 
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
 
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
 
}