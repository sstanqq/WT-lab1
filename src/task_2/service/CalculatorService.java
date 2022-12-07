package task_2.service;

import task_2.model.Point;

import java.util.Scanner;

public class CalculatorService {
    private Scanner scanner;

    private static final double X1_1 = -4;
    private static final double X1_2 = 4;
    private static final double Y1_1 = 0;
    private static final double Y1_2 = 5;

    private static final double X2_1 = -6;
    private static final double X2_2 = 6;
    private static final double Y2_1 = 0;
    private static final double Y2_2 = 3;

    public CalculatorService() {
        scanner = new Scanner(System.in);
    }

    public boolean isInArea(double x, double y) {
        return Math.abs(x) >= X1_1 && Math.abs(x) <= X1_2 && Math.abs(y) >= Y1_1 && Math.abs(y) <= Y1_2 || Math.abs(x) >= X2_1 && Math.abs(x) <= X2_2 && Math.abs(y) >= Y2_1 && Math.abs(y) <= Y2_2;
    }

    public Point inputPoint() {
        Point userPoint = new Point();
        System.out.print("Input x: ");
        userPoint.setX(scanner.nextDouble());
        System.out.print("Input y: ");
        userPoint.setY(scanner.nextDouble());
        return userPoint;
    }
}
