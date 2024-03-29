package ChainOfResponsability;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ApprovedHandler();
        Handler h2 = new DeniedHandler();
        Handler h3 = new PendingHandler();
        h1.setNext(h2);
        h2.setNext(h3);
        h1.check("APPROVED");
        h1.check("APPROVED");
        h1.check("DENIED");
        h1.check(null);
        h1.check("DENIED");
    }
}

