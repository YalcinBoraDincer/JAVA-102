import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class checker {
    static Set<String> dictionary = new HashSet<>();
    public static void main(String[] args) throws FileNotFoundException {

            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                dictionary.add(data);
            }
            scanner.close();


    }

    public static ArrayList<String> checker(String word){
        word = word.toLowerCase();
        word = word.replaceAll("[^a-zA]", "");

        ArrayList<String> wordlist = new ArrayList<>();

        if (dictionary.contains(word)){
            wordlist.add(word);
            return wordlist;
        }else{
            for(int k = 0; k < word.length(); k++){
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder stringBuilder1 = new StringBuilder();
                StringBuilder stringBuilder2;
                StringBuilder stringBuilder3;

                //delete
                stringBuilder.append(word, 0, k);
                stringBuilder.append(word.substring(k+1));


    }}
        return wordlist;
    }
}