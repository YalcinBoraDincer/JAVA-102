import java.util.*;


public class TreeSetExercises{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.print("Enter n:");
        int n=scan.nextInt();

        TreeSet<Integer> set=new TreeSet<>();
        Random rand= new Random();

        for(int i=0;i<n;i++)
            set.add(rand.nextInt(100));
        System.out.println("TreeSet:"+set);

        System.out.println("Reversed TreeSet:"+reverseSet(set));
        System.out.println("Enter K:");
        int k=scan.nextInt();
        System.out.println("TreeSet with elements >50:"+greayerEqK(set,k));
    }

    static NavigableSet<Integer> reverseSet(TreeSet<Integer> set)
    {
        NavigableSet<Integer> res=set.descendingSet();
        return res;
    }

    static int getFirst(TreeSet<Integer> set)
    {
        return set.first();
    }

    static int getLast(TreeSet<Integer> set)
    {
        return set.last();
    }

    static TreeSet<Integer> greayerEqK(TreeSet<Integer> set,int k)
    {
        TreeSet<Integer> res=new TreeSet<>();
        for(int i:set)
        {
            if(i>=k)
                res.add(i);
        }
        return res;
    }

    static void removeElem(TreeSet<Integer> set,int k)
    {
        set.remove(k);
    }
}

   /* Task 5 (10pts):
    Consider the four core interfaces, Set, List, Queue, and Map. For each of the following four assignments, specify which of the four core interfaces is best-suited, and explain how to use it to implement the assignment.
1.	Whimsical Toys Inc (WTI) needs to record the names of all its employees. Every month, an employee will be chosen at random from these records to receive a free toy.
2.	WTI has decided that each new product will be named after an employee but only first names will be used, and each name will be used only once. Prepare a list of unique first names.
3.	WTI decides that it only wants to use the most popular names for its toys. Count up the number of employees who have each first name.
4.	WTI acquires season tickets for the local lacrosse team, to be shared by employees. Create a waiting list for this popular sport.


1=List because there is no restrictions.
2=Sets because list should not have Duplicate values.
3=Map because there is a key value between employees and toys names.
3=Queue because we consider that its look like ticket queue. First in first out action.
    */



