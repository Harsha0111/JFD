import java.util.Scanner;

public class CheckBalance {

    public void checkBalance(){
        Scanner scanner = new Scanner(System.in);
        Utils util = new Utils();
        util.valid();
        int fbal = Utils.balance;
        System.out.println(fbal);
    }

}
