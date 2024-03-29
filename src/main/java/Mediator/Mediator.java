package Mediator;

import java.util.ArrayList;

public class Mediator implements IMediator {
    private ArrayList<Colleague> colleagues;

    public Mediator() {
        this.colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void send(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}

