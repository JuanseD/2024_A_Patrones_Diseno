package Mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator m) {
        this.setMediator(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague1: " + message);
    }
}

