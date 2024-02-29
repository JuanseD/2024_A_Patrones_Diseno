/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

/**
 *
 * @author tatan
 */
public abstract class Shop {

    public void buySomething() {
        Payment payment = makePayment();
        makePayment().paymentMethod();
    }

    public abstract Payment makePayment();
}
