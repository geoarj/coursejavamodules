package com.georgyarzhancev.javacore.chapter18;

import java.sql.SQLOutput;
import java.util.ArrayList;
/*
Only for direct going through the collection
and does not let to change the elements of the collection
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.print("Initial content of arraylist: ");
        for (int v : vals)
            System.out.print(v + " ");

        System.out.println();

        int sum = 0;
        for (int v : vals)
            sum += v;

        System.out.println("Sum of numbers " + sum);
    }
}
