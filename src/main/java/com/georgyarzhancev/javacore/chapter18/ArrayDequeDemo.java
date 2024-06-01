package com.georgyarzhancev.javacore.chapter18;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Extracting from Stack: ");

        while (adq.peek() != null)
            System.out.println(adq.pop() + " ");
    }
}
