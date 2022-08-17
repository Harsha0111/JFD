import java.util.Scanner;

public class Addition {
    public int Add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter a num2");
        int num2 = scanner.nextInt();
        return (num1 + num2);
    }
}
