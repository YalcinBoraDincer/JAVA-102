public class Main {
    public static void main(String[] args) {

        //Out o=new Out();
        //o.run();

        //Out.In in=o.new In();
        //in.run();


        //LocalClass l=new LocalClass();

        //l.run();

        AnonoimSinif a=new AnonoimSinif(){
            @Override
            public void run(){
                System.out.println("Ekrana Anonim Olarak run metodu ! ");
            }
        };
        a.run();
    }
}