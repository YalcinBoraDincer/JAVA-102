public class academician extends Worker {
    private String department;
    private String degree;

    academician(String name,String mpNo,String mail,String department,String degree){
        super(name, mpNo, mail);
        this.degree=degree;
        this.department=department;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setDepartment(String department){
        this.department=department;

    }
    public void attend(){
        System.out.println(this.getName()+"Has attend the lesson");
    }


}
