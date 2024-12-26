package com.tabriji.objectOrientedProgramming;

public class CreditCard {
    private final long cardNumber;
    private final int cvv;
    private final String cardHolderName;
    private final String validThrough;

    public CreditCard(long cardNumber, int cvv, String cardHolderName, String validThrough) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
        this.validThrough = validThrough;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getValidThrough() {
        return validThrough;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "cardNumber=" + cardNumber + ", cvv=" + cvv + ", cardHolderName='" + cardHolderName + '\'' + ", validThrough='" + validThrough + '\'' + '}';
    }
}
