package Facade;

public class Facade {
    private CheckFluids fluids;
    private CheckSeat seat;
    private CheckMirrors mirrors;
    private StartEngine startEngine;

    public Facade() {
        this.fluids = new CheckFluids();
        this.seat = new CheckSeat();
        this.mirrors = new CheckMirrors();
        this.startEngine = new StartEngine();
    }

    public void startCar() {
        fluids.check();
        seat.check();
        mirrors.check();
        startEngine.turnOnIgnition();
    }
}
