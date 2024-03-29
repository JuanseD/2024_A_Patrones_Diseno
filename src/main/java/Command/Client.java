package Command;

public class Client {
    public static void main(String[] args) {
        Menu objMenu = new Menu();
        Receiver objReceiver = new Receiver();
        IMenuItem objOpenOption = new MenuItemOpen(objReceiver);
        IMenuItem objPrintOption = new MenuItemPrint(objReceiver);
        IMenuItem objExitOption = new MenuItemExit(objReceiver);
        objMenu.add(objOpenOption);
        objMenu.add(objPrintOption);
        objMenu.add(objExitOption);
        objMenu.get(0).execute();
        objMenu.get(1).execute();
        objMenu.get(2).execute();
    }
}

