package Decorator;

public class HorizontalScrollBarDecorator extends ScrollDecorator {
    public HorizontalScrollBarDecorator(IWindow window) {
        super(window);
    }

    @Override
    public void draw(int column, int row) {
        this.getWindow().draw(column, row);
        this.drawHorizontalScrollBar();
    }

    private void drawHorizontalScrollBar() {
        System.out.println("Added horizontal scroll bar");
    }
}

