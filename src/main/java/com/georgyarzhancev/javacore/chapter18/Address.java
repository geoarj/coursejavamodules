package com.georgyarzhancev.javacore.chapter18;

import java.util.LinkedList;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;


    Address(String n, String s, String c,
            String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + state + " " + code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<Address>();

        m1.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61904"));
        m1.add(new Address("Ralph Baker", "1142 Oak Ave",
                "Mahomet", "IL", "619333"));
        m1.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61923"));

        for (Address element : m1)
            System.out.println(element + "\n");

        System.out.println();

    }
}

