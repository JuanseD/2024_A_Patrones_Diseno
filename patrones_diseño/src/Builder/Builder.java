/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tatan
 */
public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setWheels(int wheels);

    void setLeatherSeats(Boolean leatherSeats);

    void setBatteries(int batteries);

    void setConvertible(Boolean convertible);

    void setElectricCar(Boolean electricCar);
}
