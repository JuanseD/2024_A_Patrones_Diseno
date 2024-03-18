package Adapter;

public class ElectricMotor {

    private boolean connected = false;

    public ElectricMotor() {
        System.out.println("Creating electric motor");
        this.connected = false;
    }

    public void connect() {
        System.out.println("Connecting electric motor");
        this.connected = true;
    }

    public void activate() {
        if (!this.connected) {
            System.out.println("Cannot activate because the electric motor is not connected");
        } else {
            System.out.println("It's connected, activating electric motor...");
        }
    }

    public void moveFaster() {
        if (!this.connected) {
            System.out.println("Cannot move electric motor faster because it's not connected...");
        } else {
            System.out.println("Moving faster...increasing voltage");
        }
    }

    public void stop() {
        if (!this.connected) {
            System.out.println("Cannot stop electric motor because it's not connected");
        } else {
            System.out.println("Stopping electric motor");
        }
    }

    public void disconnect() {
        System.out.println("Disconnecting electric motor...");
        this.connected = false;
    }
}

