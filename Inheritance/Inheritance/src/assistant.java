public class assistant extends academician{
    private String workHour;

    public assistant(String name, String mpNo, String mail, String department, String degree, String workHour) {
        super(name, mpNo, mail, department, degree);
        this.workHour = workHour;
    }

    public String getWorkHour() {
        return workHour;
    }

    public void setWorkHour(String workHour) {
        this.workHour = workHour;
    }
    public void makeQuiz(){
        System.out.println(this.getName()+"He will make a new quiz on September 11");
    }

}
