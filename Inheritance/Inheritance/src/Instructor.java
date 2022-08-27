public class Instructor extends academician{
    private String doorNum;


    public Instructor(String name, String mpNo, String mail, String department, String degree, String doorNum) {
        super(name, mpNo, mail, department, degree);
        this.doorNum = doorNum;
    }

    public String getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(String doorNum) {
        this.doorNum = doorNum;
    }

    public void meeting(){
        System.out.println(this.getName()+"Started a new meeting in the conference room!");
    }
    public void makeTest(){
        System.out.println(this.getName()+" Maked a new test ");
    }

}
