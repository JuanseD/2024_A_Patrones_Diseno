/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tatan
 */
public class CarBuilder implements Builder {

    private Integer seats;
    private CarType carType;
    private Integer bigWheels;
    private Engine engine;
    private Boolean leatherSeats;
    private Integer batteries;
    private Boolean convertible;
    private Boolean electricCar;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setWheels(int wheels) {
        this.bigWheels = wheels;
    }

    @Override
    public void setLeatherSeats(Boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    @Override
    public void setBatteries(int batteries) {
        this.batteries = batteries;
    }

    @Override
    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public void setElectricCar(Boolean electricCar) {
        this.electricCar = electricCar;
    }

    public Car getCar() {
        return new Car(carType, seats, bigWheels, engine, leatherSeats, bigWheels, convertible, electricCar);
    }
}
