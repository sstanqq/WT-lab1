package task_3;

import task_3.model.Argument;
import task_3.service.CalculatorService;

public class App {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        Argument argument = calculatorService.inputData();

        calculatorService.drawTable(argument);
    }
}
