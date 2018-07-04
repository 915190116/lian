import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookMap {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<String, Book>();
        String[] bookNo = {"7-5377-1623-4", "7-80627-201-1", "7-115-12269-5", "7-5377-11183-2"};
        String[] bookName = {"Java程序设计1", "文化苦旅2", "Java程序设计3", "Java程序设计4"};
        String[] author = {"朱喜福", "余秋雨", "朱喜福", "朱喜福"};
        String[] publisher = {"人民邮电出版社", "东方出版社", "人民邮电出版社", "人民邮电出版社"};
        Integer[] price = {32, 18, 32, 32};
//        Book book = new Book("7-5377-1623-4", "Java程序设计", "朱喜福", "人民邮电出版社", 32);
//        Book book1 = new Book("7-80627-201-1", "文化苦旅", "余秋雨", "东方出版社", 18);
//        Book book2 = new Book("7-115-12269-5", "Java程序设计", "朱喜福", "人民邮电出版社", 32);
//        Book book3 = new Book("7-5377-11183-4", "Java程序设计", "朱喜福", "人民邮电出版社", 32);
        for (int i = 0; i < bookNo.length; i++) {
            Book book = new Book(bookNo[i], bookName[i], author[i], publisher[i], price[i]);
            books.put(bookNo[i], book);
        }
//        books.put(String.valueOf(book.compareTo(book)), book);
//        books.put(String.valueOf(book.compareTo(book1)), book1);
//        books.put(String.valueOf(book.compareTo(book2)), book2);
//        books.put(String.valueOf(book.compareTo(book3)), book3);
//        Collection<Book> v = books.values();
//        Iterator<Book> iterator = v.iterator();
//        System.out.println(books);
        for (Book book0 : books.values()) {
            System.out.println(book0);
        }
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
