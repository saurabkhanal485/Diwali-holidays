package com.demo.service;

import com.demo.beans.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addNewEmp();

    List<Employee> showAllEmp();

    boolean deleteById(int id);

    List<Employee> sortedEmp();

    List<Employee> findByName(String name);

    boolean saveAllEmp();
}
