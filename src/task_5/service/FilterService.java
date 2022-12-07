package task_5.service;

import java.util.Arrays;
import java.util.Scanner;

public class FilterService {
    private Scanner scanner;

    public FilterService() {
        scanner = new Scanner(System.in);
    }

    public int getCount() {
        return foundElementCount(inputArray());
    }

    private int[] inputArray() {
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

    private int foundElementCount(int[] array) {
        int[] sortArray = sort(array);
        int j = 0;
        int i = 0;
        int maxCount = 0;
        while (i < array.length && j < array.length) {
            while (i < array.length && array[i] < sortArray[j])
                i++;
            while (j < array.length && i < array.length && array[i] > sortArray[j])
                j++;
            if (j < array.length && i < array.length && array[i] == sortArray[j]) {
                maxCount++;
                j++;
                i++;
            }
        }
        return array.length - maxCount;
    }

    private int[] sort(int[] array) {
        int[] sortArray = array.clone();
        Arrays.sort(sortArray);
        return sortArray;
    }
}
