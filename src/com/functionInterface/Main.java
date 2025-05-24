package com.functionInterface;

import java.util.function.Function;

/**
 *
 * @author vishnu
 */
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction= str-> str.length();
        
        int length= lengthFunction.apply("Vishnu");
        System.out.println(length);
    }
    
}
