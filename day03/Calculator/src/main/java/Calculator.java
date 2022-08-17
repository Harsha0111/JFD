import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Calculation calculation = new Calculation();
        menu.displayMenu();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice > 0 & choice <= 5) {

            switch (choice) {
                case (1):
                    System.out.println(calculation.Add());
                    break;
                case (2):
                    System.out.println(calculation.Sub());
                    break;
                case (3):
                    System.out.println(calculation.multi());
                    break;
                case (4):
                    System.out.println(calculation.div());
                    break;

            }  else{
                System.out.println("error");
            }
        }
    }
}

