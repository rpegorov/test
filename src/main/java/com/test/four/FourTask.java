package com.test.four;

import java.util.Arrays;

/**
 * Дописать метод сортировки массива чисел
 */
public class FourTask {

    public static void main(String[] args) {
        int[] values = new int[]{4, 1, 2, 5, 9};
        int[] sorted = sort(values);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int temp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = temp;
            }
        }
        return arr;
    }
}
