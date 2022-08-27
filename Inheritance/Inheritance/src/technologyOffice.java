public class technologyOffice  extends Officer{
    private String task;

    public technologyOffice(String name, String mpNo, String mail, String department, String workhour, String task) {
        super(name, mpNo, mail, department, workhour);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void networkSetup(){
        System.out.println(this.getName()+this.getTask()+" Has started a network setup");
    }
}
