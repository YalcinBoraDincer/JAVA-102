import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExercises{
    public static void main(String[] args) {

        HashSet<Integer> set=new HashSet<>();
        addElement(set,10);
        addElement(set,15);
        addElement(set,4);
        addElement(set,5);

        System.out.println(set);


    }

    static void addElement(HashSet<Integer> set,int n)
    {
        set.add(n);
    }

    static boolean emptyCheack(HashSet<Integer> set)
    {
        return set.isEmpty();
    }

    static ArrayList<Integer> convertToList(HashSet<Integer> set)
    {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:set)
        {
            res.add(i);
        }
        return res;
    }

    static boolean compareToSets(HashSet<Integer> set1,HashSet<Integer> set2)
    {
        if(set1.size()==set2.size())
        {
            List<Integer> list1= new ArrayList<Integer>(set1);
            List<Integer> list2= new ArrayList<Integer>(set2);
            for(int i=0;i<set1.size();i++)
            {
                if(list1.get(i)!=list2.get(i))
                    return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    static HashSet<Integer> setsIntersection(HashSet<Integer> set1,HashSet<Integer> set2)
    {
        HashSet<Integer> res=new HashSet<>();
        for(int i:set1)
        {
            if(set2.contains(i))
                res.add(i);
        }
        return res;
    }

    static HashSet<Integer> cloneSet(HashSet<Integer> set)
    {
        HashSet<Integer> res=new HashSet<>();
        for(int i:set)
        {
            res.add(i);
        }
        return res;
    }

    static void removeAllElements(HashSet<Integer> set)
    {
        for(int i:set)
        {
            set.remove(i);
        }
    }


}