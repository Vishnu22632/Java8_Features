package com.lambdaexpression;

/**
 *
 * @author vishnu
 */
public class Main {

    public static void main(String[] args) {
        Employee e = () -> "Vishnu Thakur";
        
        System.out.println(e.getName());
    }

}
