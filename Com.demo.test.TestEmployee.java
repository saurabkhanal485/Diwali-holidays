package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.*;

import java.util.List;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeService eservice= new EmployeeServiceImpl();

        Scanner sc = new Scanner(System.in);
        int choice=0;
        do {
            System.out.println("1. Add Employee to list\n" +
                    "2. Remove Employee list\n" +
                    "3. Show all Employee\n" +
                    "4. Show all Employee in sorted order (sort on the basis of empID)\n" +
                    "5. Find a Employee with empName\n" +
                    "6. Save all Employees into file\n" +
                    "7. Quit\n choice : ");

            choice=sc.nextInt();
            switch (choice){
                case 1->{
                    boolean status = eservice.addNewEmp();
                    if(status){
                        System.out.println("employeee addedd successfullly");
                    }else{
                        System.out.println("not added");
                    }
                }
                case 2->{
                    System.out.println("enter id to remove");
                    int id = sc.nextInt();
                    boolean status = eservice.deleteById(id);
                    if(status){
                        System.out.println("deleted successfully");
                    }else{
                        System.out.println("not found");

                    }

                }
                case 3->{
                    List<Employee> elist= eservice.showAllEmp();
                    elist.forEach(System.out::println);
                }
                case 4->{
                    List<Employee>elist= eservice.sortedEmp();
                    elist.forEach(System.out::println);
                }
                case 5->{
                    System.out.println("enter name");
                    String name = sc.next();
                    List<Employee>elist = eservice.findByName(name);
                    if(elist !=null){
                        elist.forEach(System.out::println);
                    }else{
                        System.out.println("not found");
                    }

                }
                case 6->{
                    boolean status = eservice.saveAllEmp();
                    if(status){
                        System.out.println("employee saved in file");
                    }else{
                        System.out.println("not saved");
                    }
                }
                case 7->{
                    sc.close();
                    System.out.println("thanks for visiting");
                }
                default -> {
                    System.out.println("Wrong choice!!!");
                }

            }

        }while(choice!=7);
    }

}
