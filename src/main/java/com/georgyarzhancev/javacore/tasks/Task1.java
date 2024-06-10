package com.georgyarzhancev.javacore.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Дан массив целых чисел.
Необходимо реализовать метод, который возвращает индексы массива,
значения которых в сумме дают число переданное в массив.
Предполагается, что массив содержит только уникальные числа и
всегда имеет искомые числа.
Один и тот же элемент не может быть использован дважды.
array = [3, 8, 15, 17], Number = 23
result = [1,2]
Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
 */
public class Task1 {

    public int[] resultIndexesOfArrayOfSumNew(int[] numbers, int goalSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {

            int amount = goalSum - numbers[i];


            if (map.containsKey(amount) && map.get(amount) != i) {
                return new int[]{map.get(amount), i};
            }
        }
        throw new IllegalArgumentException("No indexes found.");
    }

    public int[] resultIndexesOfArrayOfSum(int[] arrayNums, int goalSum) {
        int i = 0;
        while (i < arrayNums.length - 1) {
            int j = i + 1;
            while (j < arrayNums.length) {
                if (arrayNums[i] + arrayNums[i + 1] == goalSum) {
                    return new int[]{i, j};
                }
                j++;
            }
            i++;
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arrayNums = new int[n];

        for (int i = 0; i < n; i++) {
            arrayNums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target sum:");
        int goalSum = scanner.nextInt();

        Task1 task1 = new Task1();

        int[] result;
        try {
            result = task1.resultIndexesOfArrayOfSumNew(arrayNums, goalSum);
            System.out.println("Result: [" + result[0] + "," + result[1] + "]");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

}
