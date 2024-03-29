package Memento;

public class Originator {
    private String name;
    private String surname;

    public Originator(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setMemento(Memento m) {
        this.name = m.getName();
        this.surname = m.getSurname();
    }

    public Memento createMemento() {
        return new Memento(name, surname);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
