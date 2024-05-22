import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Book {
    private final String title;
    private final String author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
                .append("title", title)
                .append("author", author)
                .toString();
    }
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Book){
            Book b = (Book) o;
            if (b.title.equals(this.title)) return true;
        }
        return false;
    }





}
