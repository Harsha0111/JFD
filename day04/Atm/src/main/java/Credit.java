import java.util.Scanner;

public class Credit {
    public void credits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you credit: ");
        int amount = scanner.nextInt();
        int bal = Util.balance;
        Util util = new Util();
        util.valid();
        int add = bal + amount;
        Util.balance = add;
        System.out.println(add);
    }
}
