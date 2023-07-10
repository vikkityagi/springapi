package com.example.springSessionManager.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springSessionManager.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Employee employee) {
        entityManager.persist(employee);
    }

    @Transactional
    public Employee update(Employee employee) {
        return entityManager.merge(employee);
    }

    public List<Employee> findAll() {
        // String jpql = "SELECT u FROM User u WHERE u.username = :username";
        // Query query = entityManager.createQuery(jpql);
        // query.setParameter("username", username);

        // List<User> users = query.getResultList();
        String jpql = "select c from Employee c";
        TypedQuery<Employee> query = entityManager.createQuery(jpql, Employee.class);

        return query.getResultList();
    }

    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Transactional
    public void delete(int employeeid) {
        Employee employee = entityManager.find(Employee.class, employeeid);
        entityManager.remove(employee);
    }
}
