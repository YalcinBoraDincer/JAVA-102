import java.util.ArrayList;

public class Counter implements Runnable {
    private ArrayList<Integer> evenNumbers = new ArrayList<>();
    private ArrayList<Integer> oddNumbers = new ArrayList<>();
    private ArrayList<Integer> Thread1 = new ArrayList<>();
    private ArrayList<Integer> Thread2 = new ArrayList<>();
    private ArrayList<Integer> Thread3 = new ArrayList<>();
    private ArrayList<Integer> Thread4 = new ArrayList<>();

    ArrayList<Integer> oneToTenThousant = new ArrayList<>();
    {
        for (int i=0;i<10000;i++){
            oneToTenThousant.add(i);
        }
        for (int num:oneToTenThousant){
            if (num<=oneToTenThousant.size()/4){
                Thread1.add(num);
            }if (num<=oneToTenThousant.size()/2){
                Thread2.add(num);}
            if (num<=oneToTenThousant.size()*3/4){
                    Thread3.add(num);
        }   else{
                Thread4.add(num);
            }
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Thread-0")){
            for (int number:Thread1){
                add(number);
            }
        }if (Thread.currentThread().getName().equals("Thread-1")){
            for (int number:Thread2){
                add(number);
            }
        }if (Thread.currentThread().getName().equals("Thread-2")){
            for (int number:Thread3){
                add(number);
            }
        }if (Thread.currentThread().getName().equals("Thread-3")){
            for (int number:Thread4){
                add(number);
            }
        }


    }

    synchronized void add(int number){
        if (number%2==0){
            System.out.println(Thread.currentThread().getName()+"->"+number);
            evenNumbers.add(number);
        }else {
            System.out.println(Thread.currentThread().getName()+"->"+number);
            oddNumbers.add(number);

        }
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public void setEvenNumbers(ArrayList<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(ArrayList<Integer> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public ArrayList<Integer> getThread1() {
        return Thread1;
    }

    public void setThread1(ArrayList<Integer> thread1) {
        Thread1 = thread1;
    }

    public ArrayList<Integer> getThread2() {
        return Thread2;
    }

    public void setThread2(ArrayList<Integer> thread2) {
        Thread2 = thread2;
    }

    public ArrayList<Integer> getThread3() {
        return Thread3;
    }

    public void setThread3(ArrayList<Integer> thread3) {
        Thread3 = thread3;
    }

    public ArrayList<Integer> getThread4() {
        return Thread4;
    }

    public void setThread4(ArrayList<Integer> thread4) {
        Thread4 = thread4;
    }

    public ArrayList<Integer> getOneToTenThousant() {
        return oneToTenThousant;
    }

    public void setOneToTenThousant(ArrayList<Integer> oneToTenThousant) {
        this.oneToTenThousant = oneToTenThousant;
    }
}
