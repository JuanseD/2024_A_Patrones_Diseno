package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Colleague cc1 = new ConcreteColleague1(mediator);
        Colleague cc2 = new ConcreteColleague2(mediator);
        Colleague cc3 = new ConcreteColleague3(mediator);
        mediator.addColleague(cc1);
        mediator.addColleague(cc2);
        mediator.addColleague(cc3);
        cc2.communicate("ConcreteColleague2 has changed!");
    }
}

