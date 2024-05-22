import ExceptionInMain.NoBookFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private final List<Book> BOOKS = new ArrayList<>();
    public List<Book> search(String searchString){
       List<Book>  matchingBook = new ArrayList<>();
        for (Book b: BOOKS){
            if ((b.getTitle().toUpperCase()).contains(searchString.toUpperCase())
                    || (b.getAuthor().toUpperCase().contains(searchString.toUpperCase()))){
                matchingBook.add(b);

            }
        }
        return matchingBook;
    }
    public void add(Book book){
        BOOKS.add(book);
    }
}
