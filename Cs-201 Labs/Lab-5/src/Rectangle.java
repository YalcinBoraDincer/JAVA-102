public class Rectangle extends Shape{
    double height;
    double width;
    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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