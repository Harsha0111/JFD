import java.util.Scanner;

public class Calci {

    public int getUserChoice(Scanner scanner) {
        System.out.println("Enter Your Choice");
        int choice = scanner.nextInt();
        return choice;
    }

    public char getOperators(Scanner scanner) {
        System.out.println("Enter the operator (+,-,*,/)");
        return scanner.next().charAt(0);
    }
}
