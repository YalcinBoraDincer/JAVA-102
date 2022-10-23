public class Employee extends Person {
    //Create private class variables id (int) and hourlyPay (double)
    private int id;
    private double hourlyPay;

     /*constructor: (int id, double hourlyPay, String firstName, String lastName, int height)
    Don't forget your call to super!
    */

    public Employee(String firstName, String lastName, double height_feet, double height_inches, int id, double hourlyPay) {
        super(firstName, lastName, height_feet, height_inches);
        this.id = id;
        this.hourlyPay = hourlyPay;
    }
    /*Write Getters and Setters for both of the class variables.
    getHourlyPay
    getId
    setHourlyPay
    setId
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    /*payDay(int hours): This method calculates how much the employee earned for the week.
    First calculate their pay, if the employee worked more than 40 hours, then any hour OVER 40 is worth 1.5 times their normal pay,
    this is considered overtime pay, otherwise their pay is as normal.

    Return their total pay for the week (double).

    Example: if I worked 45 hours this week, I would get 5 hours of overtime pay and 40 hours of normal pay.
    */


    public double payDay(int hour) {
        double payCheck = 0;
        if (hour < 40) {
            payCheck = getHourlyPay() * hour;
        } else {
            payCheck = getHourlyPay() * 40 + (getHourlyPay() * 1.5 * (hour = 40));
        }
        return payCheck;


    }
     /* getRaise: This method gives a raise to the user, increasing their pay by 15%.
    Return the value of the employee's new hourlyPay (double)
    */

    public double getRaise() {
        this.hourlyPay = getHourlyPay() + (getHourlyPay() * (0.15));
        return hourlyPay;
    }

    //override the toString method


    @Override
    public String toString() {
        return super.toString() + "They make " + getHourlyPay() + " $" + "\n" + "They have the employee " + getId() + " id number" + "\n";
    }


    //override the equals method

    public boolean equals(Employee other) {
        if (other.getId() == getId() && other.getLastName() == getLastName()) {
            return true;
        } else {
            return false;
        }
    }
}



















