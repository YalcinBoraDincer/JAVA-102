import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1=new Book("Ali Baba Ve Kirk Haramiler",120);
        Book b2=new Book("Dune Col Gezegeni",670);
        Book b3=new Book("Dune Mesihi",440);
        Book b4=new Book("Yuzuklerin Efendisi Iki Kule",500);
        Book b5=new Book("Yerdeniz",1120);

        Set<Book> bookSetByName=new TreeSet<>();

        bookSetByName.add(b1);
        bookSetByName.add(b2);
        bookSetByName.add(b3);
        bookSetByName.add(b4);
        bookSetByName.add(b5);



        System.out.println("Books sorted by name");
        System.out.println("========================================");
        System.out.println();
        for (Book b:bookSetByName){
            System.out.println(b);
        }

        Set<Book> bookSetByPageNo=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNo()-o2.getPageNo();
            }
        });
        bookSetByPageNo.add(b1);
        bookSetByPageNo.add(b2);
        bookSetByPageNo.add(b3);
        bookSetByPageNo.add(b4);
        bookSetByPageNo.add(b5);


        System.out.println();
        System.out.println("Books sorted by pageNo");
        System.out.println("========================================");
        System.out.println();
        for (Book b:bookSetByPageNo){
            System.out.println(b);
        }


    }
}