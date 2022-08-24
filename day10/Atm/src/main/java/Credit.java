import java.util.Scanner;

public class Credit
{
    public void credits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you credit: ");
        int amount = scanner.nextInt();
        int bal = Utils.balance;
        Utils util = new Utils();
        util.valid();
        int add = bal + amount;
        Utils.balance = add;
        System.out.println(add);
    }
}
