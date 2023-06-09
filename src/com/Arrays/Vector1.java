package com.Arrays;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(66);
        v.add(44);
        v.add(77);
        v.add(22);

        System.out.println("Printing through enhanced for loop: ");
        for (Integer i : v) {
            System.out.println(i);
        }

        System.out.println("Printing through Iterator method: ");
        Iterator it = v.iterator();
        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            System.out.println(i);
        }
    }
}
