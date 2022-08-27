public class Worker {
    private String name;
    private String mpNo;
    private String mail;


    Worker(String name, String mpNo, String mail) {
        this.name = name;
        this.mpNo = mpNo;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void enter(){
        System.out.println(this.name+"Has entered the university ! ");
    }
    public void leave(){
        System.out.println(this.name+"Has leaved the university !");
    }
    public void refectory(){
        System.out.println(this.name+"Has entered the refectory !");
    }

}







