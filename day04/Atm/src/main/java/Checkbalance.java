public class Checkbalance {
    public void checks() {
        Util util = new Util();
        util.valid();
        int fbal = Util.balance;
        System.out.println(fbal);
    }
}
