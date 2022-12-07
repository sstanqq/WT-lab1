package task_6;

import task_6.service.GeneratorService;

public class App {
//    Точка входа
    public static void main(String[] args) {
        GeneratorService generatorService = new GeneratorService();

        generatorService.crateMatrix();
    }
}
