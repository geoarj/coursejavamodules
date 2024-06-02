package com.georgyarzhancev.javacore.tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Дан массив целых чисел.
Необходимо реализовать метод, которые определяет, содержит
ли данный массив дубликаты
Пример:
Array: [4,5,6,6,8]
Result: true
Число 6 повторяется 2 раза
Array: [4,5,6,7,8]
Result: false
Дубликатов нет
 */
public class Task2 {

    public boolean arrayContainsDuplicate(int[] arrayNums) {
        Set<Integer> set = new HashSet<>();
        for (int num : arrayNums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the array");
        int[] arrayNums = new int[n];

        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = scanner.nextInt();
        }

        Task2 task2 = new Task2();
        boolean result;
        try {
            result = task2.arrayContainsDuplicate(arrayNums);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
