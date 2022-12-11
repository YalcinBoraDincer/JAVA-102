import java.util.ArrayList;
import java.util.Random;

public class Polymorphism {
    public static void main1 (String[] args){
        Random r = new Random();

        ArrayList<Shape> shape_list = new ArrayList<>();

        for(int i = 0; i < 5;i++){
            Circle c1 = new Circle(r.nextDouble(),r.nextDouble(),r.nextDouble());
            shape_list.add(c1);

        }

        for(int j = 0; j < 5; j++){
            Rectangle r1 = new Rectangle(r.nextDouble(),r.nextDouble(),r.nextDouble(), r.nextDouble());
            shape_list.add(r1);
        }

        Shape shape = shape_list.get(0);
        System.out.println(shape.getInfo(shape_list));
        System.out.println(shape.findCircles(shape_list));
    }
}