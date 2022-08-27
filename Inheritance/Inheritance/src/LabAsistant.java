public class LabAsistant extends assistant{
    public LabAsistant(String name, String mpNo, String mail, String department, String degree, String workHour) {
        super(name, mpNo, mail, department, degree, workHour);
    }
    public void enteraLab(){
        System.out.println(this.getName()+"Should enter the labs ");
    }
    public void enterLessons(){
        System.out.println(this.getName()+"Should enter the lessons ");
    }

    }

