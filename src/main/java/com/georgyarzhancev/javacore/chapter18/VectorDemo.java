package com.georgyarzhancev.javacore.chapter18;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Initial size of vector: " + v.size());
        System.out.println("Initial capacity of vector " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Capacity after inserting 4 elems: " + v.capacity());

        v.addElement(5);
        System.out.println("Current capacity of vector: " + v.capacity());

        v.addElement(6);
        v.addElement(7);

        System.out.println("Current capacity of vector: " + v.capacity());

        v.addElement(9);
        v.addElement(10);

        System.out.println("Current capacity of vector: " + v.capacity());

        v.addElement(11);
        v.addElement(12);

        System.out.println("First element of vector: " + v.firstElement());
        System.out.println("Last element of vector: " + v.lastElement());

        if (v.contains(3))
            System.out.println("Vector contains 3.");

//        Enumeration<Integer> vEnum = v.elements();

        Iterator<Integer> vItr = v.iterator();

        System.out.println("\nElements of vector");
//        while (vEnum.hasMoreElements())
//            System.out.print(vEnum.nextElement() + " ");
//        System.out.println();
//        while (vItr.hasNext())
//            System.out.print(vItr.next() + " ");
        for (int i : v)
            System.out.print(i + " ");
        System.out.println();
    }
}
