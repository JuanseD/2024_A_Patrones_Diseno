package Composite;

public abstract class Node {
    public static final int FILE = 1;
    public static final int FOLDER = 2;
    protected String name = "";
    protected int nodeType;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNodeType() {
        return this.nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }

    public abstract void display();
}

