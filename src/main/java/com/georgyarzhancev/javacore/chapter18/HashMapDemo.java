package com.georgyarzhancev.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("John Dow", 232.4);
        hm.put("Tom Smith", 123.4);
        hm.put("Jein Baker", 1353.4);
        hm.put("Tod Hall", 100.2);
        hm.put("Ralph Smit", -222.4);

        // get set of elements
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // print
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // input sum of 1000 on the John Dow
        double balance = hm.get("John Dow");
        hm.put("John Dow", balance + 1000);
        System.out.println("New balance of John Dow: " + hm.get("John Dow"));






    }
}
