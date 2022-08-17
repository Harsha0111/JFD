import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Calci calci = new Calci();
        Scanner scanner = new Scanner(System.in);
        int choice = calci.getUserChoice(scanner);
        System.out.println("Enter the numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char operator = calci.getOperators(scanner);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                break;
        }

    }
}