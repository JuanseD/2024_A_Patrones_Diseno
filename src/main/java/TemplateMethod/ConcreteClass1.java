package TemplateMethod;

public class ConcreteClass1 extends AbstractClass {
    public ConcreteClass1() {
    }

    @Override
    public int multiply(int num) {
        return num * 100;
    }

    @Override
    public int add(int num) {
        return num + 10;
    }
}

