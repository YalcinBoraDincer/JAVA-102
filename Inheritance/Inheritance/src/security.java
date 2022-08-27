public class security extends Officer{
    private String document;

    public security(String name, String mpNo, String mail, String department, String workhour, String document) {
        super(name, mpNo, mail, department, workhour);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    public void watch(){
        System.out.println(this.getName()+"Started a shift work");
    }
}
