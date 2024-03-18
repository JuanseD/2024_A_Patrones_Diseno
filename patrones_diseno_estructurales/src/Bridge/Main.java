package Bridge;

public class Main {
    public static void main(String[] args) {
        PrepareFood lasagna = new PrepareLasagna(new Meat());
        lasagna.get();
        lasagna.setImplementor(new Vegetables());
        lasagna.get();
    }
}

