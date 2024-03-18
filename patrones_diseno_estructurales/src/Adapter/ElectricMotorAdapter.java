package Adapter;

public class ElectricMotorAdapter extends Motor {
    private ElectricMotor electricMotor;

    public ElectricMotorAdapter(){
        super();
        this.electricMotor = new ElectricMotor();
        System.out.println("Creating Electric Motor Adapter");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on Electric Motor Adapter");
        this.electricMotor.connect();
        this.electricMotor.activate();
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating electric motor...");
        this.electricMotor.moveFaster();
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off electric motor");
        this.electricMotor.stop();
        this.electricMotor.disconnect();
    }
}

