public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calci();
        int resAdd = calculator.add();
        System.out.println(resAdd);
        calculator.sub(1,2);
        int resMul = calculator.mul(3,6);
        System.out.println(resMul);
        calculator.div();
    }
}
