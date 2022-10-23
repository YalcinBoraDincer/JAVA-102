public class Person {
    private double height_feet;
    private double height_inches;
    private String lastName;
    private String firstName;
    public Person(String firstName,String lastName,double height_feet, double height_inches) {
        this.lastName=lastName;
        this.firstName = firstName;
        this.height_feet=height_feet;
        this.height_inches=height_inches;
    }

    public double getHeight_feet() {
        return height_feet;
    }

    public void setHeight_feet(double height_feet) {
        this.height_feet = height_feet;
    }

    public double getHeight_inches() {
        return height_inches;
    }

    public void setHeight_inches(double height_inches) {
        this.height_inches = height_inches;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String toString() {
        return "Name: "+getFirstName()+" "+getLastName()+"\n"+"They are "+getHeight_feet()+ "'"+ getHeight_inches() + "''" + "\n";
    }

}