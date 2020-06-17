import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
    public static  void main (String [] args){
        int a = 10;
        System.out.print("Fibonacci Series of " + a + " numbers: ");
        for(int i = 0; i < a; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }

}