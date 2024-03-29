package Command;

public class Receiver {
    public Receiver() {
    }

    public void action(String action) {
        if (action.compareTo("OPEN") == 0) {
            System.out.println("Open document");
        } else if (action.compareTo("PRINT") == 0) {
            System.out.println("Print document");
        } else if (action.compareTo("EXIT") == 0) {
            System.out.println("Exit program");
        } else {
            System.out.println("Invalid option");
        }
    }
}
