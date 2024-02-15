import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Book book1=new Book("Lord of the rings",520,"J.R.R Tolkien",1954);
        Book book2=new Book("Dune messiah",560,"Frank Helbert",1969);
        Book book3=new Book("Harry Potter and the Philosopher's Stone ",223,"J. K. Rowling",1997);
        Book book4=new Book("The Word of Unbinding",600,"Ursula K. Le Guin",1964);
        Book book5=new Book("Oyasumi Punpun",500,"Inio Asano",2016);
        Book book6=new Book("Ajin",200,"Tsuina Miura",2015);
        Book book7=new Book("Name of Wind",520,"Patrick Rothfuss",2007);
        Book book8=new Book("The Wise Man's Fear",1200,"Patrick Rothfuss",2011);
        Book book9=new Book("Ikigami",120,"Motoro Mase",2016);
        Book book10=new Book("Lord of the ring the two towers",520,"J.R.R Tolkien",1954);

        ArrayList<Book> myPrecious=new ArrayList<>();
        myPrecious.add(book1);
        myPrecious.add(book2);
        myPrecious.add(book3);
        myPrecious.add(book4);
        myPrecious.add(book5);
        myPrecious.add(book6);
        myPrecious.add(book7);
        myPrecious.add(book8);
        myPrecious.add(book9);
        myPrecious.add(book10);

        HashMap<String,String> bookAndAuthor = new HashMap<>();
        myPrecious.forEach(book -> bookAndAuthor.put(book.getBookName(), book.getAuthorName()));
        bookAndAuthor.forEach((name, author) -> System.out.println("Book name: " + name + ", Author name: " + author));

        System.out.println();


        HashMap<String, String> newMap = new HashMap<>();
        myPrecious.stream().filter(book -> book.getPageNo() > 100).forEach(book -> newMap.put(book.getBookName(), book.getAuthorName()));
        newMap.forEach((name, author) -> System.out.println("Book name: " + name + ", Author name: " + author));








        }}







