public class Main {
    public static void main(String[] args) {

        Worker c1=new Worker("Batur","666-333","asd");


        academician a1=new academician("Murat","333-222","asfs","CENG","Profesor");
        Officer o1=new Officer("Remzi","333-22322","aasdsfs","CENG","31");


        Instructor I1=new Instructor("Halil","333-222","asfs","CENG","Profesor","62/2");

        technologyOffice t1=new technologyOffice("Bora","555-555","sdfcgsd","CENG","20","Bilisim sistemi");
        t1.networkSetup();
        o1.enter();
        o1.leave();
    }
}