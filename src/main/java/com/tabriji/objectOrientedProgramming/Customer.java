package com.tabriji.objectOrientedProgramming;

public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name, CreditCard creditCard) {
        this.name = name;
        this.creditCard = creditCard;
    }

    public Customer(String name, long cardNumber, int cvv, String cardHolderName, String validThrough) {
        this.name = name;
        this.creditCard = new CreditCard(cardNumber, cvv, cardHolderName, validThrough);
    }
}
