package question5;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println (o);
        if(this == o) return true;
        if(!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(this.title, book.title) && Objects.equals(this.author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }

}
