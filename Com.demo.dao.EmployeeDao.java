package com.demo.dao;

import com.demo.beans.Employee;

import java.util.List;

public interface EmployeeDao {
    boolean addNewEmployee(Employee emp);

    List<Employee> showAll();

    boolean removebyid( int id);

    List<Employee> sortedEmployee();

    List<Employee> findByEmpName(String name);

    boolean saveToFile();
}
