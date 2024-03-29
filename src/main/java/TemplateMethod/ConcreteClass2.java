package TemplateMethod;

public class ConcreteClass2 extends AbstractClass {
    public ConcreteClass2() {
    }

    @Override
    public int multiply(int num) {
        return num * 1000;
    }

    @Override
    public int add(int num) {
        return num + 100;
    }
}

