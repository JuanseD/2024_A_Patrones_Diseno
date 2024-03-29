package ChainOfResponsability;

public class PendingHandler extends Handler {
    public PendingHandler() {
    }

    @Override
    public void check(String status) {
        if (status == null) {
            System.out.println("Request pending");
        } else {
            if (this.getNext() != null) {
                this.getNext().check(status);
            }
        }
    }
}
