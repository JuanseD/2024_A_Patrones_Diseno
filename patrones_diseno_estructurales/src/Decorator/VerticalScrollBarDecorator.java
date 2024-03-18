package Decorator;

public class VerticalScrollBarDecorator extends ScrollDecorator {
    public VerticalScrollBarDecorator(IWindow window) {
        super(window);
    }

    @Override
    public void draw(int column, int row) {
        // Draw the window
        this.getWindow().draw(column, row);
        // Add vertical scroll bar
        this.drawVerticalScrollBar();
    }

    private void drawVerticalScrollBar() {
        System.out.println("Added vertical scroll bar");
    }
}

