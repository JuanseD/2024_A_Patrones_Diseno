package ChainOfResponsability;

public class ApprovedHandler extends Handler {
    public ApprovedHandler() {
    }

    @Override
    public void check(String status) {
        if (status != null && status.equalsIgnoreCase("APPROVED")) {
            System.out.println("Request approved");
        } else {
            if (this.getNext() != null) {
                this.getNext().check(status);
            }
        }
    }
}
