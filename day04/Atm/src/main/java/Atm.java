import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Process process = new Process();
        process.displayMenu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    Withdrawl withdrawl = new Withdrawl();
                    withdrawl.withDraw();
                    break;
                }
                case 2: {
                    Credit credit = new Credit();
                    credit.credits();
                    break;
                }
                case 3: {
                    Checkbalance checkbalance = new Checkbalance();
                    checkbalance.checks();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }

            }
            process.displayMenu();
        }
    }
}
