package task_1;

import task_1.model.Data;
import task_1.service.CalculatorService;

public class App {
    // Точка входа
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        Data data = calculatorService.inputData();

        System.out.println(calculatorService.calculate(data.getX(), data.getY()));
    }
}
