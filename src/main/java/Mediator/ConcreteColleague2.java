package Mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator m) {
        this.setMediator(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague2: " + message);
    }
}
