package task_1.service;

import task_1.model.Data;

import java.util.Scanner;

public class CalculatorService {
    private Scanner scanner;

    public CalculatorService() {
        scanner = new Scanner(System.in);
    }

    public double calculate(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }

    public Data inputData() {
        Data data = new Data();
        System.out.print("Input x: ");
        data.setX(scanner.nextDouble());
        System.out.print("Input y: ");
        data.setY(scanner.nextDouble());
        return data;
    }
}
