import java.util.Scanner;

public class Prime {
    public static void main (String[] args) {
        int flag =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check if prime or not :");
        int num = scanner.nextInt();
        System.out.println("Number entered is :" + num);
        if (num == 2 || num ==3){
            System.out.println( num + " " + "is a prime number");
        } else  {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " " + "is not a prime number");
                    flag =1;
                    break;
                }
            } if (flag ==0 ){
                System.out.println(num + " " + "is a prime number");
            }


        }
    }

}
