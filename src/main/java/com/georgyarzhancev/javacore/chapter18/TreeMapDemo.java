package com.georgyarzhancev.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("John Dow", 232.4);
        tm.put("Tom Smith", 123.4);
        tm.put("Jein Baker", 1353.4);
        tm.put("Tod Hall", 100.2);
        tm.put("Ralph Smit", -222.4);

        // get set of elements
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // print
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // input sum of 1000 on the John Dow
        double balance = tm.get("John Dow");
        tm.put("John Dow", balance + 1000);
        System.out.println("New balance of John Dow: " + tm.get("John Dow"));






    }
}

