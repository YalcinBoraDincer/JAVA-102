public class LocalClass {

    public void run(){
        System.out.println("Local Classi Run Metodu Calisti");

        //Local Sinif
        class Yerel{
            private int a;

            public Yerel(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y=new Yerel(31);
        System.out.println(y.getA());
    }





}
