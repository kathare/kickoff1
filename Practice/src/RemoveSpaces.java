import javax.swing.*;
import java.util.Scanner;

public class RemoveSpaces {
    public static  void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to remove spaces : ");
        String input = scanner.nextLine();
        System.out.print("Name without spaces  " +input.replaceAll("\\s+", ""));
    }
}
