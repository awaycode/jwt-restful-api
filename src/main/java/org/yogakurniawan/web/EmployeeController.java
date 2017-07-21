package org.yogakurniawan.web;

import org.yogakurniawan.domain.Employee;
import org.yogakurniawan.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
