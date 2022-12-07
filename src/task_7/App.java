package task_7;

import task_7.service.ShellSortService;

import java.util.Arrays;

public class App {
//    Точка входа
    public static void main(String[] args) {
        ShellSortService service = new ShellSortService();
        int[] inputArray = service.inputArray();

        System.out.println(Arrays.toString(service.shellSort(inputArray)));
    }
}
