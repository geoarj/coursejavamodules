package com.georgyarzhancev.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {
    // compare last names in both strings
    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // find index of symbol from which starts the last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) // if last names match, check name and last name fully
            return aStr.compareTo(bStr);
        else
            return k;
    }
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new CompLastNames());

        tm.put("John Dow", 232.4);
        tm.put("Tom Smith", 123.4);
        tm.put("Jein Baker", 1353.4);
        tm.put("Tod Hall", 100.2);
        tm.put("Ralph Smith", -222.4);

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

