package Memento;

public class Main {
    public static void main(String[] args) {
        Originator creator = new Originator("Juan Pablo", "Carlos");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(creator.createMemento());
        System.out.println("Full name: [" + creator.getName() + " " + creator.getSurname() + "]");
        creator.setName("Maria Jose");
        creator.setSurname("Samuel");
        System.out.println("Full name: [" + creator.getName() + " " + creator.getSurname() + "]");
        creator.setMemento(caretaker.getMemento());
        System.out.println("Full name: [" + creator.getName() + " " + creator.getSurname() + "]");
    }
}

