package Adapter;

public class Application {
    private void useRegularMotor() {
        Motor motor = new RegularMotor();
        motor.turnOn();
        motor.accelerate();
        motor.turnOff();
    }

    private void useElectricMotor() {
        Motor motor = new ElectricMotorAdapter();
        motor.turnOn();
        motor.accelerate();
        motor.turnOff();
    }
}
