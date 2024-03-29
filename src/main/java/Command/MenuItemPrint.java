package Command;

public class MenuItemPrint implements IMenuItem {
    Receiver receiver;

    public MenuItemPrint(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action("PRINT");
    }
}

