public class Calci implements Calculator{

    @Override
    public int add() {
        return 6+96;
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public int mul(int a, int b) {
        return 3*6;
    }

    @Override
    public void div() {
        System.out.println(6/6);

    }
}
