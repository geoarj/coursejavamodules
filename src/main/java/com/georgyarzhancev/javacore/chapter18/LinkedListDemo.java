package com.georgyarzhancev.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addLast("A");
        ll.add(1, "A2");

        System.out.println("Initial content of linked list ll:" + ll);

        ll.remove("F");
        ll.remove(2);

        System.out.println("Content of ll after deletion " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("After deleting 1 and 2 element " + ll);

        String val = ll.get(2);
        ll.set(2, val + " changed");

        System.out.println("Content of LL after changes" + ll);


    }
}
