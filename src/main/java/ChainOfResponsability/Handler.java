package ChainOfResponsability;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler getNext() {
        return this.nextHandler;
    }

    public void setNext(Handler h) {
        this.nextHandler = h;
    }

    public abstract void check(String status);
}

