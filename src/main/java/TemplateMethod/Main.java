package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        ConcreteClass1 cc1 = new ConcreteClass1();
        ConcreteClass2 cc2 = new ConcreteClass2();
        int num1 = cc1.obtain(3);
        System.out.println("num1: " + num1);
        int num2 = cc2.obtain(50);
        System.out.println("num2: " + num2);
    }
}

