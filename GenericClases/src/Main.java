public class Main {
    public static void main(String[] args) {

        //Undefined
        String s;

        //Null
        String s1=null;

        //Empty
        String s3="";



           // Integer a=12;
          //  String b="ABC";
         //   Nullable<Integer> n=new Nullable<>(a);
        //    n.run();


        Integer p=13;
        String str="Bora";
        Double d=3.14;

        Test <Integer,String,Double>test=new Test<>(p,str,d);
        test.showInfo();


    }
}