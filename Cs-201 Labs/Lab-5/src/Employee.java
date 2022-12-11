public class Employee extends Person {
    private int id;
    private double hourlyPay;
    public Employee(String firstName, String lastName, double height_feet, double height_inches,int id,double hourlyPay) {
        super(firstName, lastName, height_feet, height_inches);
        this.id=id;
        this.hourlyPay=hourlyPay;
    }

    public int getId() {
        return id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRaise(){
        this.hourlyPay = getHourlyPay()*(1.15);
        return getHourlyPay();
    }
    public double payDay(int hour){
        if(hour<=40){
            return getHourlyPay()*hour;
        }else{
            return getHourlyPay()*40 + ((getHourlyPay()*1.5)*(hour-40));
        }
    }

    @Override
    public String toString() {

        return super.toString()+ "They make "+String.format("%.2f",getHourlyPay()) +" $"+"\n"+"They have the employee "+getId()+" id number"+ "\n";
    }


    public boolean equals(Employee otherObject) {
        if(otherObject.getId()==getId() && otherObject.getLastName().equals(getLastName())){
            return true;
        }
        else{
            return false;
        }
    }


}