
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        
        System.out.println("Give a number:");
        number = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + number);
        // write your program here

    }
}
