package question5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Book> bookSet = new HashSet<>();

        // 같은 내용의 Book  객체 3개
        Book b1 = new Book("자바의 정석","박종원");
        Book b2 = new Book("자바의 정석", " 박종원");
        Book b3 = new Book("자바의 정석","박종원");
        
        // 다른 책
        Book b4 = new Book("book1","author1");
        Book b5 = new Book("book2","author2");

        // HashSet에 추가
        bookSet.add(b1); 
        bookSet.add(b2);  // 내용이 다르므로 저장됨
        bookSet.add(b3); // 내용이 같으므로 저장되지 않음
        bookSet.add(b4); // 다른 책이므로 저장됨
        bookSet.add(b5);

        System.out.println("저장된 책의 개수 : " +  bookSet.size());
        System.out.println("저장된 책 목록 : ");
        for(Book book : bookSet) {
            System.out.println(book);
        }


        

    }
}
