package com.anonymous;

/**
 *
 * @author vishnu
 */
public class Main {
    public static void main(String[] args) {
        Employee emp= new Employee() {
            
            @Override
            public String getSalary() {
                return "10";
            }

            @Override
            public String getDesignation() {
                return "Java Developer";
            }
        };
        System.out.println(emp.getSalary());
        System.out.println(emp.getDesignation());
    }
}
