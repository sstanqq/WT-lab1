package task_8;

import task_8.service.InsertService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(8);

        b.add(4);
        b.add(10);
        b.add(100);
        InsertService insertService = new InsertService();
        insertService.getInsertedIndexes(a, b);
    }
}
