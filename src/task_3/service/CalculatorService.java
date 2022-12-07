package task_3.service;

import task_3.model.Argument;

import java.util.Scanner;

public class CalculatorService {
    private Scanner scanner;

    public CalculatorService() {
        scanner = new Scanner(System.in);
    }

    public Argument inputData() {
        Argument argument = new Argument();
        System.out.print("Input a: ");
        argument.setA(scanner.nextDouble());
        System.out.print("Input b: ");
        argument.setB(scanner.nextDouble());
        System.out.print("Input h: ");
        argument.setH(scanner.nextDouble());
        return argument;
    }

    private double calculation(double x) {
        return Math.tan(x);
    }

    public void drawTable(Argument argument) {
        drawHeadOfTable();
        double x = argument.getA();
        while(x <= argument.getB()) {
            System.out.printf("| %3.2f | %7.4f |\n", x, calculation(x) );
            x += argument.getH();
        }
    }

    private void drawHeadOfTable() {
        System.out.println("|   x   |   F(x)  |");
    }

}
