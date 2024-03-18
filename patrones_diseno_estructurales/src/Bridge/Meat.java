package Bridge;

public class Meat implements IPrepare {
    public Meat() {
    }

    @Override
    public void process() {
        System.out.println("\tMeat lasagna prepared");
    }
}

