package Observer;

public class ObserverImpl implements IObserver {
    private String name;

    public ObserverImpl(String name) {
        this.setName(name);
        System.out.println("Observer [" + this.name + "] created");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Observer [" + this.getName() + "] receives the notification");
    }
}

