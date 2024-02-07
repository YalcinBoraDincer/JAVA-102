import java.util.Arrays;

public class myList <T>{
    private T array[];
    private int capacity;
    private int size;


    public myList(){
        this.capacity=10;
        this.array=(T[])new Object[capacity];
        this.size=0;

    }
    public myList(int capacity) {
        this.capacity = capacity;
        this.array=(T[])new Object[capacity];
        this.size=0;
    }
    public void add(T data){
        if (size==capacity){
            expandCapacity();
        }
        array[size++]=data;

    }

    public void expandCapacity(){
        capacity*=2;
        T newArray [] = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
    public T get(int index){
        if (index<0 || index>=size){
            return null;
        }
        return array[index];
    }

    public T remove(int index){

        if (index<0 || index>=size){
            return null;
        }
        T removedItem = array[index];
        for (int i=index;i<size-1;i++){
            array[i]=array[i+1];
        }
        array[size-1]=null;
        size--;
        return removedItem;
    }

    public T set (int index,T data){
        if (index<0 || index>=size){
            return null;
        }
        return array[index]=data;
    }


    public String toString() {
        String result = "";
        for (int i=0;i<size;i++){
            result+=this.array[i]+" ";

        }
        return result;
    }
    int indexOf(T data){

        for (int i=0;i<size;i++){
            if (array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i=size-1;i>=0;i--){
            if (array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }
    public T[] toArray(){

        T newArray [] = (T[]) new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }
    public void clear(){
        Arrays.fill(array,"");
    }
    public myList<T> sublist(int start,int finish){
        myList<T> sublist=new myList<>(finish-start+1);
        for (int i=start;i<=finish;i++){
            sublist.add(get(i));
        }
        return sublist;
    }
    boolean contains(T data){
        for (int i=0;i<size;i++){
            if (array[i]==data){
                return true;
            }
        }
        return false;
    }






















    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
