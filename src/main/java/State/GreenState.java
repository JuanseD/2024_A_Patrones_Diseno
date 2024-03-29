package State;

public class GreenState extends TrafficLightState {
    public GreenState() {
    }

    @Override
    public void display() {
        System.out.println("Green light");
    }
}

