package task_14_1.model;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;


    @Override
    protected Object clone() {
        Book book = new Book();
        book.title = this.title;
        book.author = this.author;
        book.price = this.price;
        return book;
    }
}
