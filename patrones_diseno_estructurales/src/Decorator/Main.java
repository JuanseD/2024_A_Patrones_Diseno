package Decorator;

public class Main {
    public static void main(String[] args) {
        IWindow window1 = new Window();
        window1.draw(50, 70);
        System.out.println("-----");

        IWindow window2 = new VerticalScrollBarDecorator(new Window());
        window2.draw(300, 200);
        System.out.println("-----");

        IWindow window3 = new HorizontalScrollBarDecorator(new Window());
        window3.draw(400, 300);
        System.out.println("-----");

        IWindow window4 = new VerticalScrollBarDecorator(new HorizontalScrollBarDecorator(new Window()));
        window4.draw(100, 120);
    }
}

