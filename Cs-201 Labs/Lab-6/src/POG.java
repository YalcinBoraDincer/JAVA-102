import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class POG {
    public static void main(String[] args) {

       Triangle t=new Triangle(5,12);
       System.out.println(t.calculateArea());
        System.out.println(t.calculateCircumference());

        Rectangle r=new Rectangle(5,10);
        System.out.println(r.calculateArea());
        System.out.println(r.calculateCircumference());

        Circle c=new Circle(5);
        System.out.println(c.calculateArea());
        System.out.println(c.calculateCircumference());

    }
}
