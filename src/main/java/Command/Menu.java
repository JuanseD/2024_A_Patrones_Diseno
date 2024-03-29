package Command;

import java.util.ArrayList;

public class Menu {
    private ArrayList<IMenuItem> menuItems = new ArrayList<IMenuItem>();

    public Menu() {
    }

    public void add(IMenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public IMenuItem get(int option) {
        return this.menuItems.get(option);
    }
}

