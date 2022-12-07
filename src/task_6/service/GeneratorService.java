package task_6.service;

import java.util.Scanner;

public class GeneratorService {
    private Scanner scanner;
    private int arrayLength;

    public GeneratorService() {
        scanner = new Scanner(System.in);
    }

    public void crateMatrix() {
        int[] userArray = inputArray();
        int[][] matrix = generateMatrix(userArray);
        outputMatrix(matrix);
    }

    private int[][] generateMatrix(int[] userArray) {
        int firstElement = 0;
        int[][] matrix = new int[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.arraycopy(userArray, 0, matrix[i], 0, arrayLength);
            firstElement = userArray[0];
            for (int j = 0; j < arrayLength - 1; j++) {
                userArray[j] = userArray[j+1];
            }
            userArray[arrayLength-1] = firstElement;
        }
        return matrix;
    }

    private int[] inputArray() {
        System.out.print("Input array length: ");
        arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Input array[" + i + "] ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private void outputMatrix(int[][] matrix) {
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
