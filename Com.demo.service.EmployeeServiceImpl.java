package com.demo.service;

import com.demo.beans.Employee;
import com.demo.dao.*;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl  implements EmployeeService {
    Scanner sc = new Scanner(System.in);
    private EmployeeDao edao;
    public EmployeeServiceImpl(){
        super();
        edao= new EmployeeDaoImpl();
    }

    @Override
    public boolean addNewEmp() {
        System.out.println("enter employee id");
        int id = sc.nextInt();
        System.out.println("enter employee name");
        String name = sc.next();
        System.out.println("enter employee role");
        String role = sc.next();
        Employee emp = new Employee(id,name,role);
        return edao.addNewEmployee(emp);
    }

    @Override
    public List<Employee> showAllEmp() {
        return edao.showAll();
    }

    @Override
    public boolean deleteById(int id) {
        return edao.removebyid(id);
    }

    @Override
    public List<Employee> sortedEmp() {
        return edao.sortedEmployee();
    }

    @Override
    public List<Employee> findByName(String name) {
        return edao.findByEmpName(name);
    }

    @Override
    public boolean saveAllEmp() {
        return edao.saveToFile();
    }
}
