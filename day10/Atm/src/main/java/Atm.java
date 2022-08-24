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
                    Withdraw withdrawl = new Withdraw();
                    withdrawl.withdrawl();
                    break;
                }
                case 2: {
                    Credit credits = new Credit();
                    credits.credits();
                    break;
                }
                case 3: {
                    CheckBalance checkBalance = new CheckBalance();
                    checkBalance.checkBalance();
                    break;
                }
                case 4:{
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                }


            }
        }
    }

}
