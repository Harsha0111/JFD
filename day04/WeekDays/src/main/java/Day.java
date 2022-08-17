import java.util.Scanner;

public class Day {
    public static void main(String[] args) {

        Scanner scannerFind = new Scanner(System.in);

        System.out.println("Enter any number from 1 to 8 = ");
        int number = scannerFind.nextInt();

        DayB dayB = new DayB();
        dayB.find(number);
    }
}
