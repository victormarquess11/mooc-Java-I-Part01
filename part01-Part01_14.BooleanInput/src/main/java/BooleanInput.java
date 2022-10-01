
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean booleanValue;
        
        System.out.println("Write something:");
        booleanValue = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + booleanValue);
        // write your program here

    }
}
