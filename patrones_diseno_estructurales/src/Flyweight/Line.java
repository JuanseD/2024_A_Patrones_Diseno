package Flyweight;

public class Line implements LightweightLine {
    private String color;

    public Line(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void draw(int column, int row) {
        System.out.println("Drawing a line of color [" + this.color + "] at [" + column + ", " + row + "]");
    }
}

