package com.mainak.faker;

import java.time.LocalDate;

public class FakePersonal {
    // Method to generate fake Full Name
    public String fullName() {
        String[] firstNames = {"John", "Jane", "Alice", "Bob", "Charlie", "Eve", "Frank", "Grace", "Rohit", "Aisha", "Carlos", "Yuki", "Fatima", "Liam", "Sofia", "Zhang Wei"};
        String[] lastNames = {"Doe", "Mukherjee", "Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Patel", "Khan", "Garcia", "Kim", "Hernandez", "Nguyen", "Singh", "Martinez"};
        String firstName = firstNames[(int) (Math.random() * firstNames.length)];
        String lastName = lastNames[(int) (Math.random() * lastNames.length)];
        return firstName + " " + lastName;
    }
    public String firstName(){
        String[] firstNames = {"John", "Jane", "Alice", "Bob", "Charlie", "Eve", "Frank", "Grace", "Rohit", "Aisha", "Carlos", "Yuki", "Fatima", "Liam", "Sofia", "Zhang Wei"};
        String firstName = firstNames[(int) (Math.random() * firstNames.length)];
        return firstName;
    }
    public String lastName(){
        String[] lastNames = {"Doe", "Mukherjee", "Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Patel", "Khan", "Garcia", "Kim", "Hernandez", "Nguyen", "Singh", "Martinez"};
        String lastName = lastNames[(int) (Math.random() * lastNames.length)];
        return lastName;

    }

    // Function to generate a random username
    public String username(){
        // Example output: "john_doe123"
        String firstName = firstName().toLowerCase();
        String lastName = lastName().toLowerCase();
        int number = (int) (Math.random() * 1000);
        String username = firstName + "_" + lastName + number;
        return username;
    }

    // Function to generate a random password of given length
    public String password(int length){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            password.append(chars.charAt(index));
        }
        return password.toString();
    }

    // Function to generate a random email address
    public String email(){
        String[] domains = {"email.com", "mail.com", "inbox.com", "example.com", "test.com"};
        String domain = domains[(int) (Math.random() * domains.length)];
        String email = firstName().toLowerCase() + "." + lastName().toLowerCase() + "@" + domain;
        return email;
    }

    // Function to generate a random phone number with country code
    public String phoneNumber() {
        String[] countryCode = {"+1", "+44", "+91", "+81", "+61", "+49", "+33", "+86"};
        String code = countryCode[(int) (Math.random() * countryCode.length)];
        String number = String.valueOf((long) (Math.random() * 1_000_000_0000L));
        while (number.length() < 10) {
            number += "0";
        }
        return code + " " + number;
    }

    // Function to generate a random date of birth
    public LocalDate dateOfBirth() {
        int year = (int) (Math.random() * 76) + 1950; // Year between 1950 and 2026
        int month = (int) (Math.random() * 12) + 1; // Month between 1 and 12
        int day = (int) (Math.random() * 28) + 1; // Day between 1 and 28 to avoid invalid dates
        return LocalDate.of(year, month, day);
    }

}
