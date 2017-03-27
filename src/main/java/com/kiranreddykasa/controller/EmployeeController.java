package com.kiranreddykasa.controller;
 
import com.kiranreddykasa.domain.Employee;
import com.kiranreddykasa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
/**
 * Created by kiran on 4/13/2015.
 */
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
 
    @Autowired
    private EmployeeService employeeService;
 
    @RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public List<Employee> listEmployees() {
 
        return employeeService.findAllEmployees();
    }
 
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Employee showEmployee(@PathVariable("id") Long id) {
 
        return employeeService.findEmployee(id);
    }
 
    @RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody
    public void saveEmployee(@RequestBody Employee employee) {
 
        employeeService.saveEmployee(employee);
    }
 
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
    @ResponseBody
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
 
        return employeeService.updateEmployee(employee);
    }
 
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    @ResponseBody
    public void deleteEmployee(@PathVariable("id") Long id) {
        Employee employee = employeeService.findEmployee(id);
        employeeService.deleteEmployee(employee);
    }
 
}