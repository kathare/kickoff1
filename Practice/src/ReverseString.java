import java.util.Scanner;

public class ReverseString {
    public static  void main (String[] args) {
        StringBuffer sbf = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to reverse : ");
        sbf.append(scanner.nextLine());
        System.out.println("Reversed name is :" + sbf.reverse() +" " + "and has" + "  "+  sbf.length() + "characters ");

    }
}
