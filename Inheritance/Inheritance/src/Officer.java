public class Officer extends Worker{
    private String department;
    private String workhour;

    public Officer(String name, String mpNo, String mail, String department,String workhour) {
        super(name, mpNo, mail);
        this.department = department;
        this.workhour=workhour;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkhour() {
        return workhour;
    }

    public void setWorkhour(String workhour) {
        this.workhour = workhour;
    }
    public void work(){
        System.out.println(this.getName()+"Calismaya basladi ");
    }

}
