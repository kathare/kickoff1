import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

    public static void listiterator(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Array List :" +list);

        ListIterator li = list.listIterator();

        while(li.hasNext())
            System.out.print(li.next() + " ");
        System.out.println();
        System.out.println("Printing in Reverse order");
        while(li.hasPrevious())
            System.out.print(li.previous() + " ");
    }

    public static void array(){
        int arr[] = {2,3,4,5};
        for( int i : arr){
            int arr2 = i * 2;
            System.out.print(arr2 + " ");
        }

    }

    public static void main (String arg[]){
    array();
    }
}
