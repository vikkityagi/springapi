package com.example.springSessionManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSessionManager.entity.Employee;
import com.example.springSessionManager.repo.EmployeeRepo;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/create")
    public void save(@RequestBody Employee employee) {
        employeeRepo.save(employee);
    }

    @PostMapping("edit")
    public void update(@RequestParam("id") int id, @RequestBody Employee employee) {

        employee.setId(id);
        employee.setName(employee.getName());
        employee.setSalary(employee.getSalary());

        employeeRepo.update(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    @GetMapping("/getOne/{id}")
    private Employee get(@PathVariable int id) {
        return employeeRepo.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable int id) {
        employeeRepo.delete(id);
    }

    

}
