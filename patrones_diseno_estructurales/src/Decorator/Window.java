package Decorator;

public class Window implements IWindow {
    public Window() {
    }

    @Override
    public void draw(int column, int row) {
        System.out.println("Basic window drawn at [" + column + "], [" + row + "]");
    }
}
