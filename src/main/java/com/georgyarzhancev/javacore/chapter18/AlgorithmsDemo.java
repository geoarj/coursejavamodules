package com.georgyarzhancev.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // Create comparator with inverse ordering
        Comparator<Integer> r = Collections.reverseOrder();

        // Sort list with this comparator
        Collections.sort(ll, r);

        System.out.print("List is sorted in invexrse order: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();

        // Shuffle list
        Collections.shuffle(ll);

        System.out.print("List is shuffled: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();
        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));


    }
}
