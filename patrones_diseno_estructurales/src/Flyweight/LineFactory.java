package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class LineFactory {
    private List<LightweightLine> lines;

    public LineFactory() {
        this.lines = new ArrayList<>();
    }

    public LightweightLine getLine(String color) {
        for (LightweightLine line : this.lines) {
            if (line.getColor().equals(color)) {
                System.out.println("Line with color [" + color + "] found, returning it");
                return line;
            }
        }
        System.out.println("Creating a line with color [" + color + "]");
        LightweightLine line = new Line(color);
        this.lines.add(line);
        return line;
    }
}

