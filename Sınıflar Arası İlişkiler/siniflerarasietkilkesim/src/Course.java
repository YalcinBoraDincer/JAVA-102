import javax.swing.plaf.PanelUI;

public class Course {
    private String courseName;
    private String cade;
    private Instructor instructor;

    public Course(String courseName, String cade,Instructor instructor) {
        this.courseName = courseName;
        this.cade = cade;
        this.instructor=instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCade() {
        return cade;
    }

    public void setCade(String cade) {
        this.cade = cade;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double calculateAve(Student[] students){
        double ave=0.0;
        for (Student student : students) {
            ave += student.getNote();
        }
        return ave / students.length;

    }
}
