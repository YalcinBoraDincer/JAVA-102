import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       Employee emp1=new Employee("Ahmet","Tanpinar",5.5,12.312,145,40);
        Employee emp2=new Employee("Haruki","Murakami",17.5,312,340,36);
        Employee emp3=new Employee("Lev","Tolstoy",170,22.2,136,33);

        System.out.println(emp1.getHourlyPay());
        System.out.println(emp1.getRaise());

        System.out.println(emp2.payDay(33));
        System.out.println(emp1.payDay(40));

        System.out.println(emp1.toString());

        ArrayList<Shape> arrlist=new ArrayList<Shape>();

        for(int i=1;i<=5;i++){
            Circle c=new Circle((int)(Math.random()*20*i),(int)(Math.random()*10*i),(int)(Math.random()*25*i));
            arrlist.add(c);
        }
        for(int j=1;j<=5;j++){
            Rectangle c=new Rectangle((int)(Math.random()*20*j),(int)(Math.random()*10*j),(int)(Math.random()*25*j),(int)(Math.random()*30*j));
            arrlist.add(c);
        }

        for (int k=0;k<arrlist.size();k++){
            System.out.println(arrlist.get(k));
        }




    }
}
