package Adapter;

public class RegularMotor extends Motor {

    public RegularMotor(){
        super();
        System.out.println("Creating the regular motor");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the regular motor");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the regular motor");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the regular motor");
    }
}
