package question3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> hashBooks = new HashSet<Book>();
        hashBooks.add(new Book("자바", "박종원"));
        hashBooks.add(new Book("자바", "박종원"));
        hashBooks.add(new Book("자료구조", "박종원"));
        hashBooks.add(new Book("마라탕", "백민주"));
        hashBooks.add(new Book("가나다라", "박종원"));
        for (Book book : hashBooks) {
            System.out.println(book);
        }
        System.out.println();

        Set<Book>linkedBooks = new LinkedHashSet<Book>();
        linkedBooks.addAll(hashBooks);
        for (Book book : linkedBooks) {
            System.out.println(book);
        }
        System.out.println();

        Set<Book> treeBook = new TreeSet<Book>(Comparator.comparing(book ->  book.title));
        treeBook.addAll(hashBooks);
        for (Book book : treeBook) {
            System.out.println(book);
        }
    }
}
