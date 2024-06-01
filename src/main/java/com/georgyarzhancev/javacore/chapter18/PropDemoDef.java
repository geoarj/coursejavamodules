package com.georgyarzhancev.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Florida", "Tellasy");
        defList.put("Viskonsin", "Medison");

        Properties capitals = new Properties(defList);
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

        // will be found in deflist
        String str = capitals.getProperty("Florida");
        System.out.println("Capital of Florida " + str + ".");
    }
}
