import java.util.Scanner;

public class Withdrawl {
    public void withDraw() {
        System.out.println("Enter the amount: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int bal = Util.balance;
        Util util = new Util();
        util.valid();
        int fbal = bal - amount;
        Util.balance = fbal;
        if (fbal > amount) {
            System.out.println(fbal);
        }
        else {
            System.out.println("Your amount is insufficient");

        }
    }
}
