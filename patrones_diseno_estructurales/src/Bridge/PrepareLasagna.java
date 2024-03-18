package Bridge;

public class PrepareLasagna extends PrepareFood {
    public PrepareLasagna(IPrepare implementor) {
        this.setImplementor(implementor);
    }

    @Override
    public void get() {
        System.out.println("Preparing lasagna...");
        this.getImplementor().process();
    }
}
