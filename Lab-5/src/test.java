import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random r = new Random();

        Employee emp1=new Employee("Ahmet","Tanpinar",5.5,12.312,145,40);
        Employee emp2=new Employee("Haruki","Murakami",17.5,312,340,36);
        Employee emp3=new Employee("Lev","Tolstoy",170,22.2,136,33);

        System.out.println(emp1.getHourlyPay());
        System.out.println(emp1.getRaise());

        System.out.println(emp2.payDay(32));
        System.out.println(emp1.payDay(45));
        System.out.println(emp1.toString());

        Polymorphism.main1(null);


    }}
