package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vishnu
 */
public class ComparatorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(33);
        list.add(22);

        System.out.println(list);

        Collections.sort(list, (a, b) -> b - a);

        System.out.println(list);

    }
}
