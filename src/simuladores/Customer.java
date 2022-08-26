/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladores;

/**
 *
 * @author Alexander Narváez
 */
public class Customer {

    String customerID;

    private String getCustomerID() {
        return customerID;
    }
}

class CreditCardCustomer extends Customer {

    public static void main(String[] args) {
        Customer brad = new CreditCardCustomer();
        brad.customerID = "12122";
        System.out.print(brad.getCustomerID());
    }

    String getCustomerID() {
        return customerID;
    }
}
