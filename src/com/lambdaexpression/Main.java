package com.lambdaexpression;

/**
 *
 * @author vishnu
 */
public class Main {

    public static void main(String[] args) {
//        MyClass myClass= new MyClass();
        Runnable runnable = () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("Hello " + i);
            }

        };

        Thread thread = new Thread(runnable);
        thread.run();
    }

}
