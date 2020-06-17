import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Array {
    public static void method1(){
        Set<Integer> set = new TreeSet<>();
        set.add(8);
        set.add(53);
        set.add(15);
        System.out.println(set);
    }
    public static void method2(){
        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(53);
        set.add(15);
        System.out.println(set);
    }
    public static void main (String args[]){
        method1();
        method2();
    }

    //contains();
    //size();
    //isEmpty(); - boolean.
    //add();
    //sort();
    //Collections.binarySearch();

    //ArrayList - you can only add at the end of the list
    //LinkedList - (double-ended queue) implements both List and Queue which means you can add, remove, access at the end or at the start of the list.
    //Stack - adds elements at the top of the stack
    //Set - no duplicate entries. Set are divided into HashSet (Stores data in hash table) TreeSet stores elements
    //in a sorted tree structure

}

