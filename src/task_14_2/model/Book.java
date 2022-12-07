package task_14_2.model;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public int getIsbn() {
        return isbn;
    }

    @Override
    public int compareTo(Book o) {
        return isbn - o.getIsbn();
    }
}
