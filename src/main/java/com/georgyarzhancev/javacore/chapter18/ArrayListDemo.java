package com.georgyarzhancev.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        System.out.println("Initial size a1: " + a1.size());

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("Size of List a1 after elements input: " + a1.size());

        System.out.println("Contet of List a1: " + a1);

        a1.remove("F");
        a1.remove(2);


        System.out.println("Size of list a1 after deleting the elements: " + a1.size());
        System.out.println("Content of list a1: " + a1);
    }
}
