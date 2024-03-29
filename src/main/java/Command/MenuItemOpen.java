package Command;

public class MenuItemOpen implements IMenuItem {
    Receiver receiver;

    public MenuItemOpen(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action("OPEN");
    }
}
