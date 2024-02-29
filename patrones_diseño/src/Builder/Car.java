/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tatan
 */
public class Car {

    private CarType carType;
    private Integer seats;
    private Integer bigWheels;
    private Engine engine;
    private Boolean leatherSeats;
    private Integer batteries;
    private Boolean convertible;
    private Boolean electricCar;

    public Car(CarType carType, Integer seats, Integer bigWheels,
            Engine engine, Boolean leatherSeats, Integer batteries, Boolean convertible,
            Boolean electricCar) {
        this.carType = carType;
        this.seats = seats;
        this.bigWheels = bigWheels;
        this.engine = engine;
        this.leatherSeats = leatherSeats;
        this.batteries = batteries;
        this.convertible = convertible;
        this.electricCar = electricCar;
    }

    public void setBigWheels(Integer bigWheels) {
        this.bigWheels = bigWheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setLeatherSeats(Boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    public void setBatteries(Integer batteries) {
        this.batteries = batteries;
    }

    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    public void setElectricCar(Boolean electricCar) {
        this.electricCar = electricCar;
    }

    public Integer getBigWheels() {
        return bigWheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public Boolean getLeatherSeats() {
        return leatherSeats;
    }

    public Integer getBatteries() {
        return batteries;
    }

    public Boolean getConvertible() {
        return convertible;
    }

    public Boolean getElectricCar() {
        return electricCar;
    }

    public CarType getCarType() {
        return carType;
    }

    public Integer getSeats() {
        return seats;
    }
}
