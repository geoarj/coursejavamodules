package com.georgyarzhancev.javacore.chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet<String> hs = new HashSet<>();
        HashSet<String> hs = new LinkedHashSet<>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);


    }
}
