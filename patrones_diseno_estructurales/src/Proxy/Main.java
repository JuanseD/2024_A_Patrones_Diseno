package Proxy;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Budget.doc");
        try {
            Thread.sleep(3000);
            document.scroll();
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}
