package Bridge;

public class Vegetables implements IPrepare {
    public Vegetables() {
    }

    @Override
    public void process() {
        System.out.println("\tVegetable lasagna prepared");
    }
}
