package Mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Mediator getMediator() {
        return this.mediator;
    }

    public void setMediator(Mediator m) {
        this.mediator = m;
    }

    public void communicate(String message) {
        this.getMediator().send(message, this);
    }
    public abstract void receive(String message);
}

