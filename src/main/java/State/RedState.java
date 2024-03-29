package State;

public class RedState extends TrafficLightState {
    public RedState() {
    }

    @Override
    public void display() {
        System.out.println("Red light");
    }
}
