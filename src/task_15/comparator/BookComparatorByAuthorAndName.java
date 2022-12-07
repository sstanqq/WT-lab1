package task_15.comparator;

import task_15.model.Book;

import java.util.Comparator;

public class BookComparatorByAuthorAndName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        if (result == 0) {
            result = o1.getTitle().compareTo(o2.getTitle());
        }
        return result;
    }
}
