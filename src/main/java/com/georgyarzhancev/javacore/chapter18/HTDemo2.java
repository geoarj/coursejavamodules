package com.georgyarzhancev.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();

        String str;
        double bal;

        balance.put("Georgy Dow", 3434.32);
        balance.put("Tomas Smith", 1342.32);
        balance.put("Joao Baker", 1378.32);
        balance.put("Konstantin Hall", 99.22);
        balance.put("Lucas Smith", -13.32);

        // Print all account in hashtable
        // first get representation of all key in the set
        Set<String> set = balance.keySet();

        // Get iterator
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        bal = balance.get("Joao Baker");
        balance.put("Joao Baker", bal + 1000);
        System.out.println("New balance for Joao: " + balance.get("Joao Baker"));
    }
}
