/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author tatan
 */
public class Application {

    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        CarBuilder builder = new CarBuilder();
        dealership.createSmallCar(builder);
        Car car = builder.getCar();
        System.out.println("My :" + car.getCarType() + " car");
    }
}
