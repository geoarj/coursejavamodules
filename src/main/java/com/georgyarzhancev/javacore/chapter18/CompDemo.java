package com.georgyarzhancev.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
//    public int compare(String a, String b) {
//        String aStr, bStr;
//        aStr = a;
//        bStr = b;
//        // do comparison in inverse
//        return bStr.compareTo(aStr);
//    }
    // override method equals() not required
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }

}

class CompDemo {
    public static void main(String[] args) {
//        MyComp mc = new MyComp();
//        TreeSet<String> ts = new TreeSet<>(new MyComp());
//        TreeSet<String> ts = new TreeSet<>(mc.reversed());
        Comparator<String> mc = (aStr, bStr) -> aStr.compareTo(bStr);
//        TreeSet<String> ts = new TreeSet<>(mc.reversed());
        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();

    }
}

