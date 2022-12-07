package task_7.service;

import java.util.Scanner;

public class ShellSortService {
    public int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input array[" + i + "] ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public int[] shellSort(int[] vector) {
        int step = vector.length / 2;
        while (step > 0) {
            int i, j;
            for (i = step; i < vector.length; i++) {
                int value = vector[i];
                for (j = i - step; (j >= 0) && (vector[j] > value); j -= step)
                    vector[j + step] = vector[j];
                vector[j + step] = value;
            }
            step /= 2;
        }
        return vector;
    }
}
