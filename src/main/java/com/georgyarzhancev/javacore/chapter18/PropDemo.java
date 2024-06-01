package com.georgyarzhancev.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Illinois", "SpringField");
        capitals.put("Missouri", "Jefferson");
        capitals.put("Washington", "Olimpia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // get Set of keys
        Set<?> states = capitals.keySet();

        // show all states and its capitals
        for (Object name : states)
            System.out.println("Capital of state " + name + " - " +
                    capitals.getProperty((String) name) + ".");
        System.out.println();

        // find state, not present in the list, setting the value, chosen by default
        String str = capitals.getProperty("Florida", "not found");
        System.out.println("Capital of FLorida " + str + ".");
    }
}
