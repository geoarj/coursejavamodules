package com.georgyarzhancev.javacore.chapter18;

import java.util.ArrayDeque;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts.subSet("C", "F"));

        System.out.println(ts);

//        PriorityQueue
//        Comparator<? super E> comparator();
//        ArrayDeque
    }
}
