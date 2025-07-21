package question5;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("java","박종원");
        Book book2 = new Book("java","박종원");
        Book book3 = new Book("java","박종원");
        Book book4 = new Book("java","박종원");
        Book book5 = new Book("java","박종원");
        //해쉬코드 재정의 안할 경우
        System.out.println(book1.hashCode()); //793589513
        System.out.println(book2.hashCode()); //1313922862

        System.out.println(book1.equals(book2)); //두개의 객체가 해쉬코드가 다르므로 false 가 나온다

        //재정의 후
//        148813727
//        148813727
//        true

//        정의 후 hashSet에 넣으면

        HashSet<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        System.out.println(books);

        //Set 는 중복을 허용하지 않기 때문에 book1만 들어가짐
    }
}
