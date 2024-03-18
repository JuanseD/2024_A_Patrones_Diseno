package Flyweight;

public class Main {
    public static void main(String[] args) {
        LineFactory factory = new LineFactory();
        LightweightLine line1 = factory.getLine("BLUE");
        LightweightLine line2 = factory.getLine("RED");
        LightweightLine line3 = factory.getLine("YELLOW");
        LightweightLine line4 = factory.getLine("BLUE");

        System.out.println("-------------------");

        line1.draw(100, 400);
        line2.draw(200, 500);
        line3.draw(300, 600);
        line4.draw(400, 700);
    }
}

