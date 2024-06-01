package com.georgyarzhancev.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

// most use is when needed parallel processing
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Call tryAdvance() for printing the content
        // of arraylist vals
        System.out.print("Content of arraylist vals:\n" );
        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println();

        // create new arraylist, having square roots of numbers
        // from arraylist vals
        spliterator = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spliterator.tryAdvance((n)
                -> sqrs.add(Math.sqrt(n))));

        // call ForEachRemaining() for printing content of
        // arraylist Sqrs
        System.out.print("Content of arraylist sqrs:\n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining(System.out::println);
        System.out.println();

    }
}
