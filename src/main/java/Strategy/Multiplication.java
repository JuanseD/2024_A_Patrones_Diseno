package Strategy;

public class Multiplication implements IArithmetic {
    public Multiplication() {
    }

    @Override
    public int performOperation(int a, int b) {
        return a * b;
    }
}
