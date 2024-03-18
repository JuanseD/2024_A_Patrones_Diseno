package Composite;

public class File extends Node {
    public File(String name) {
        this.setNodeType(Node.FILE);
        this.setName(name);
    }

    @Override
    public void display() {
        System.out.println("File: [" + this.getName() + "]");
    }
}

