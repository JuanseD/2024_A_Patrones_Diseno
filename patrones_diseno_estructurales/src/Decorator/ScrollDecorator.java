package Decorator;

public abstract class ScrollDecorator implements IWindow {
    protected IWindow window;

    public ScrollDecorator(IWindow window) {
        this.setWindow(window);
    }

    public IWindow getWindow() {
        return this.window;
    }

    public void setWindow(IWindow window) {
        this.window = window;
    }

    @Override
    public void draw(int column, int row) {
        this.getWindow().draw(column, row);
    }
}
