package Strategy;

public class Subtraction implements IArithmetic {
    public Subtraction() {
    }

    @Override
    public int performOperation(int a, int b) {
        return a - b;
    }
}

