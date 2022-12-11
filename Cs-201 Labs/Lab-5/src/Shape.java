import java.util.ArrayList;

public class Shape {
    double x;
    double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculateArea(Shape s1){
        if (s1 instanceof Circle){
            return Math.PI*Math.pow(((Circle) s1).radius,2);
        }else if (s1 instanceof Rectangle){
            return ((Rectangle) s1).height*((Rectangle) s1).width;
        }
        return 0;
    }

    public double calculateCircumference(Shape s1){
        if (s1 instanceof Circle){
            return Math.PI*((Circle) s1).radius*2;
        }else if (s1 instanceof Rectangle){
            return (((Rectangle) s1).width+((Rectangle) s1).height)*2;
        }
        return 0;
    }

    public StringBuilder getInfo(ArrayList<Shape> shape_list){
        StringBuilder stringBuilder = new StringBuilder();
        for (Shape s1:shape_list){
            if (s1 instanceof Circle){
                stringBuilder.append(String.format("Circle with radius: %.2f , Centered at X: %.2f Y: %.2f \nHas area: %.2f \nHas Circumference: %.2f\n\n", ((Circle) s1).radius,s1.x,s1.y, s1.calculateArea(s1),s1.calculateCircumference(s1))) ;
            }else if (s1 instanceof Rectangle){
                stringBuilder.append(String.format("Rectangle  with height: %.2f and width: %.2f, Centered at X: %.2f Y: %.2f \nHas area: %.2f \nHas Circumference: %.2f\n\n", ((Rectangle) s1).height, ((Rectangle) s1).width, s1.x, s1.y,s1.calculateArea(s1),s1.calculateCircumference(s1)));
            }
        }
        return stringBuilder;
    }

    public StringBuilder findCircles(ArrayList<Shape> shape_list){
        StringBuilder stringBuilder = new StringBuilder();
        for (Shape s1:shape_list){
            if (s1 instanceof Circle){
                stringBuilder.append(String.format("Circle with radius: %2f , Centered at X: %2f Y: %2f\n\n", ((Circle) s1).radius,s1.x,s1.y));
            }
        }
        return stringBuilder;
    }
}