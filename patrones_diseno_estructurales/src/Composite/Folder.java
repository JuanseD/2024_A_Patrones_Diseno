package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {
    List<Node> nodes = new ArrayList<Node>();

    public Folder(String name) {
        this.setNodeType(Node.FOLDER);
        this.setName(name);
    }

    public void insertNode(Node node) {
        nodes.add(node);
    }

    public void removeNode(Node node) {
        nodes.remove(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public Node getNode(int position) {
        return nodes.get(position);
    }

    @Override
    public void display() {
        System.out.println("Listing folder [" + this.getName() + "]");
        for (Node node : nodes) {
            node.display();
        }
    }
}

