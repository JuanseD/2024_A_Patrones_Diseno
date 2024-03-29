package ChainOfResponsability;

public class DeniedHandler extends Handler {
    public DeniedHandler() {
    }

    @Override
    public void check(String status) {
        if (status != null && status.equalsIgnoreCase("DENIED")) {
            System.out.println("Request denied");
        } else {
            if (this.getNext() != null) {
                this.getNext().check(status);
            }
        }
    }
}
