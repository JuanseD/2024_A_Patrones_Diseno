package Strategy;

public class ArithmeticOperation {
    private IArithmetic strategy;

    public ArithmeticOperation(IArithmetic strategy) {
        this.strategy = strategy;
    }

    public int process(int a, int b) {
        return strategy.performOperation(a, b);
    }
}

