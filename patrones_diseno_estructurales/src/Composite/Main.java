package Composite;

public class Main {
    public static void main(String[] args) {
        Folder c1 = new Folder("FOLDER_1");
        c1.insertNode(new File("File1.txt"));
        c1.insertNode(new File("File2.txt"));
        c1.insertNode(new File("File3.txt"));

        Folder c2 = new Folder("FOLDER_2");
        c2.insertNode(new File("File4.txt"));
        c2.insertNode(new File("File5.txt"));

        c1.insertNode(c2);

        c1.insertNode(new File("File6.txt"));

        c1.display();
        System.out.println("--------------------");

        c1.removeNode(c2);
        c1.display();
    }
}

