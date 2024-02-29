/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

/**
 *
 * @author tatan
 */
public class Application {

    private static Shop shop;

    public static void main(String[] args) {
        configure(args);
        goShopping();
    }

    static void configure(String[] args) {
        if (null != args && args[0].equalsIgnoreCase("creditCard")) {
            shop = new CreditPayment();
        } else {
            shop = new CashPayment();
        }
    }

    static void goShopping() {
        shop.buySomething();
    }
}
