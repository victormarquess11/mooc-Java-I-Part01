
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isLeapYear = false;
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        
        if ( year%4 != 0 ){
            isLeapYear = false;
        } else if ( (year%100 == 0) && (year%400 != 0) ){
            isLeapYear = false;
        } else {
            isLeapYear = true;
        }
        
        
        if (isLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
        

    }
}
