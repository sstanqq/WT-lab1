package task_4.service;

import java.util.Scanner;

public class CalculatorService {
    Scanner scanner;

    public CalculatorService() {
        scanner = new Scanner(System.in);
    }

    public void getIndexesOfPrimeNumbers() {
        int[] array = inputArray();
        for (int i = 0; i < array.length; i++) {
            if(isPrime(array[i]))
                System.out.println(i);
        }
    }

    private boolean isPrime(int num) {
        if(num <= 0)
            return false;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
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

}
