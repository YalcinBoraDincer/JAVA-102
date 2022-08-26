public class Main {
    //Encapsulation (Kapsülleme)
    //Inheritance(Kalitim) ilkesi
    //Polimorphism( Cok Bicimlilik)
    // Abstraction (Soyutlama)
    public static void main(String[] args) {
        Kitap book = new Kitap("Harry Potter", 500, "JK Rowling");

        System.out.println(book.getSayfaSayisi());

        book.setSayfaSayisi(700);
        System.out.println(book.getSayfaSayisi());
    }
}