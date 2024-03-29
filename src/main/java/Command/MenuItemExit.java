package Command;

public class MenuItemExit implements IMenuItem {
    Receiver receiver;

    public MenuItemExit(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action("EXIT");
    }
}

