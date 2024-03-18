package Bridge;

public abstract class PrepareFood {
    IPrepare implementor;
    String name;

    public IPrepare getImplementor() {
        return this.implementor;
    }

    public void setImplementor(IPrepare implementor) {
        this.implementor = implementor;
    }
    public abstract void get();
}

