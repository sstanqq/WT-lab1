package task_2;

import task_2.model.Point;
import task_2.service.CalculatorService;

public class App {
// Точка входа
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        Point userPoint = calculatorService.inputPoint();
        System.out.println(calculatorService.isInArea(userPoint.getX(), userPoint.getY()));
    }
}
