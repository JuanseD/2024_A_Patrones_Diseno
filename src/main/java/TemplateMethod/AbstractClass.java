package TemplateMethod;

public abstract class AbstractClass {
    public int obtain(int num) {
        this.message();
        int number = this.multiply(num);
        number = this.add(number);
        return number;
    }

    public void message() {
        System.out.println("Let's perform the operations...");
    }

    public abstract int multiply(int num);
    public abstract int add(int num);
}
