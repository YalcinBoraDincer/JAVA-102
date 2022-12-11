
//Outer Class
public class Out {

    public int a =5;


    //Inner Class
    public class In{
        public int a=10;

        public void run(){
            System.out.println();
            System.out.println("----- IN SINIFINA AIT RUN METODU CALISTI ----- ");
            System.out.println();
            int a=1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);

        }
    }

    public void run(){
        System.out.println();
        System.out.println("----- OUT SINIFINA AIT RUN METODU CALISTI ----- ");
        System.out.println();

        In in=new In();
        in.run();


    }

}
