package com.georgyarzhancev.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.print("Initial array: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        display(array);

        // fill array and print it
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Array after calling method fill: " );
        display(array);

        // sort and print the content of an array
        Arrays.sort(array);
        System.out.print("Array after repeated sorting: ");
        display(array);

        // make double search of value -9
        System.out.print("Value -9 is located at position ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);

    }

    private static void display(int[] array) {
        for (int i: array)
            System.out.print(i + " ");
        System.out.println();
    }
}