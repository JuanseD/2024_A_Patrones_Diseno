/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory_Method;

/**
 *
 * @author tatan
 */
public class CreditPayment extends Shop {

    @Override
    public Payment makePayment() {
        return new CreditCard();
    }
}
