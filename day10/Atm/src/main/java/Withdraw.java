import java.util.Scanner;

public class Withdraw {
    public void withdrawl(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Amount ");
        int amount = scanner.nextInt();
        int bal = Utils.balance;
        int del = bal - amount;
        Utils.balance = del;
        System.out.println(del);
    }
}
