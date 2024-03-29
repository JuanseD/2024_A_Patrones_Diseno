package State;

public class YellowState extends TrafficLightState {
    public YellowState() {
    }

    @Override
    public void display() {
        System.out.println("Yellow light");
    }
}

