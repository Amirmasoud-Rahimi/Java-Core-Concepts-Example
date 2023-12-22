package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        Book book1=new Book("Novel",2000);
        Book book2=new Book("Fiction",3000);
        Book book3=new Book("NonFiction",1000);
        List<Book> books=new ArrayList<Book>(){{
            add(book1);
            add(book2);
            add(book3);
        }};

        System.out.println("Before Sort");
        System.out.println(books);
        Collections.sort(books); // is available when class implement comparable
        System.out.println("After Sort");
        System.out.println(books);
    }
}