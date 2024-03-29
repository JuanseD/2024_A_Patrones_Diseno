package Strategy;

public class Addition implements IArithmetic {
    public Addition() {
    }

    @Override
    public int performOperation(int a, int b) {
        return a + b;
    }
}
