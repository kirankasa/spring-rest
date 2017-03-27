package com.kiranreddykasa.repository;
 
import com.kiranreddykasa.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
 
 
/**
* Created by kiran on 4/13/2015.
*/
@Repository
public interface EmployeeRepository extends JpaSpecificationExecutor<Employee> ,JpaRepository<Employee, Long> {
}
