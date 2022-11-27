import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(unique("Bora"));
        concordance("Hello World");

    }
    public static int unique(String str){
        str = str.toLowerCase();
        String[] temp = str.split("");
        Set<String> set = new HashSet<>(Arrays.asList(temp));
        return set.size();
    }
    public static void concordance(String str){
        str = str.trim().replaceAll(" ","");
        str = str.toLowerCase();
        String[] temp = str.split("");
        Map<String, ArrayList<Integer>> con = new Hashtable<>();
        for(int i = 0; i < temp.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < temp.length; j++){
                if (Objects.equals(temp[j], temp[i])){
                    list.add(j);
                }
            }
            con.put(temp[i],list);
        }
        System.out.println(con);
    }



}
