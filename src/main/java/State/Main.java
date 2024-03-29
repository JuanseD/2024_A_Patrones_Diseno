package State;

public class Main {
    public static void main(String[] args) {
        TrafficLight objTrafficLight = new TrafficLight();
        objTrafficLight.display();
        objTrafficLight.setState(new YellowState());
        objTrafficLight.display();
        objTrafficLight.setState(new GreenState());
        objTrafficLight.display();
    }
}

