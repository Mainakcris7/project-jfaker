package com.mainak.faker;

public class FakeFinance {
    // Function to generate fake credit card numbers
    public String creditCardNumber(){
        StringBuilder creditCardNumber = new StringBuilder();
        for(int i=0; i<16; i++) {
            creditCardNumber.append((int) (Math.random() * 10));
            if (i == 3 || i == 7 || i == 11) {
                creditCardNumber.append(" ");
            }
        }
        return creditCardNumber.toString();
    }

    // Function to generate fake iban numbers
    public String iban(){
        String[] countryCodes = {"DE", "GB", "FR", "ES", "IT", "NL", "BE", "CH", "SE", "NO"};
        String countryCode = countryCodes[(int) (Math.random() * countryCodes.length)];
        StringBuilder iban = new StringBuilder(countryCode);
        // Add two random check digits
        for(int i=0; i<2; i++) {
            iban.append((int) (Math.random() * 10));
        }
        // Add random alphanumeric characters (18) to make up the rest of the IBAN
        for(int i = 0; i < 18; i++) {
            if(Math.random() < 0.5) {
                iban.append((char) ('A' + (int) (Math.random() * 26))); // Random letter
            } else {
                iban.append((int) (Math.random() * 10)); // Random digit
            }
        }
        return iban.toString();
    }

    // Function to generate fake transaction ids
    public String transactionId(int length){
        if(length <= 0) length = 12; // Default length
        if(length > 20) length = 20; // Max length{
        StringBuilder transactionId = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (Math.random() < 0.5) {
                transactionId.append((char) ('A' + (int) (Math.random() * 26))); // Random letter
            } else {
                transactionId.append((int) (Math.random() * 10)); // Random digit
            }
        }
        return transactionId.toString();
    }

    // Function to generate fake currency codes
    public String currencyCode() {
        String[] currencyCodes = {"USD", "EUR", "GBP", "JPY", "INR", "AUD", "CAD", "CHF", "CNY", "SEK"};
        return currencyCodes[(int) (Math.random() * currencyCodes.length)];
    }

    // Function to generate fake price
    public double price(int min, int max){
        if(min < 0) min = 0;
        if(max <= min) max = min + 100;
        return Math.round((min + (Math.random() * (max - min))) * 100.0) / 100.0; // Round to 2 decimal places
    }
}
