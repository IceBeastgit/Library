import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class LibraryTest {
    private static final Book LORD_OF_THE_FLIES = new Book("Lord of the Flies", "William Golding");
    private static final Book LORD_OF_THE_RINGS = new Book("Lord of the Rings", "J Tolkien");
    private static final Book WAR_AND_PEACE = new Book("War and Peace", "Lord Bennett");
    private static final Book HARRY_POTTER = new Book("Harry Potter", "J.K. Rowling");

    private final Library library = new Library();

    @Before
    public void initilised(){
        library.add(LORD_OF_THE_FLIES);
        library.add(LORD_OF_THE_RINGS);
        library.add(WAR_AND_PEACE);
        library.add(HARRY_POTTER);
    }
    @Test
    public void searchReturnTheSingleBookThatMatchesTheEntireTitle(){
        List<Book> result = library.search("Lord of the Flies");
        assertEquals("Matching Books",1, result.size());
        Book book = result.get(0);
        assertEquals(LORD_OF_THE_FLIES, book);
        assertSame(LORD_OF_THE_FLIES, book);
        assertEquals("Lord of the Flies", book.getTitle());
    }
    @Test
    public void searchReturnSingleBookThatMatchesCaseInsensitiveTitle(){
        List<Book> result = library.search("lord of the flies");
        assertEquals("Matching Books",1, result.size());
        assertEquals("Lord of the Flies",result.get(0).getTitle());
    }
    @Test
    public void searchReturnsBookMatchingTitleOrAuthor(){
        List<Book> result = library.search("lord");
        assertEquals("Matching Books",3, result.size());
        assertTrue(result.contains(LORD_OF_THE_FLIES));
        assertTrue(result.contains(LORD_OF_THE_RINGS));
        assertTrue(result.contains(WAR_AND_PEACE));
        assertFalse(result.contains(HARRY_POTTER));

    }
}
