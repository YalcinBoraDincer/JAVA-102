public class Main {
    public static void main(String[] args) {
        Student st1=new Student("Batur","Dincer","123","Ebe sokak",85);
        Student st2=new Student("Bora","Dibcer","321","Visnelik",85);
        Student st3= new Student("Muge","Dincer","3213123","Kiraz sokak",85);


        Instructor teachher=new Instructor("Mahmut","Ucube","CENG");


        //Kalitim(Inheritance )==> is a
        


        // Course has a Instructor(Sinifin bir ogretmeni vardir.)--- Composition/Aggregation
        Course mat=new Course("Math101","Mat",teachher);
        System.out.println(mat.getInstructor().getName());

        // Student [] stu={st1,st2,st3};
        //System.out.println("Ortalama : "+   mat.calculateAve(stu));




    }
}