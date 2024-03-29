package Strategy;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperation context;
        context = new ArithmeticOperation(new Addition());
        int sum = context.process(36, 14);
        context = new ArithmeticOperation(new Subtraction());
        int subtract = context.process(23, 48);
        context = new ArithmeticOperation(new Multiplication());
        int multiply = context.process(85, 27);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);
    }
}

