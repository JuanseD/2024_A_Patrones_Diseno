package Mediator;

public class ConcreteColleague3 extends Colleague {
    public ConcreteColleague3(Mediator m) {
        this.setMediator(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague3: " + message);
    }
}

