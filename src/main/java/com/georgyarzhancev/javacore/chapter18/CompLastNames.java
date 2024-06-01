package com.georgyarzhancev.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String> {
    // compare last names in both strings
    @Override
    public int compare(String aStr, String bStr) {
        int i, j;
        // find index of symbol from which starts the last name
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

// sort the accounts of holders by Last Name, Name and Father name,
// if the LNs are equal
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {

        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);

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

