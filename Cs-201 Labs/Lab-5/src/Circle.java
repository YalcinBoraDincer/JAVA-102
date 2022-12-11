public class Circle extends Shape{
    double radius;
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(Shape s1) {
        return super.calculateArea(s1);
    }

    @Override
    public double calculateCircumference(Shape s1) {
        return super.calculateCircumference(s1);
    }
}