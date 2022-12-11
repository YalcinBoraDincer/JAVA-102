public class Triangle extends  Shape {
    double height;
    double base;

    public Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double calculateArea() {
        return 0.5*height*base;
    }


    public double calculateCircumference() {
        return base*3;
    }
}
