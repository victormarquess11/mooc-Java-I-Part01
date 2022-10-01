
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Give a string:");
        String text = scanner.nextLine();

        System.out.println("Give an integer:");
        int number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double numberDouble = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boolValue = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + boolValue);
        // Write your program here

    }
}
