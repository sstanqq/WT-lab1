package task_5;

import task_5.service.FilterService;

public class App {
// Точка входа
    public static void main(String[] args) {
        FilterService service = new FilterService();

        System.out.println(service.getCount());
    }
}
