package com.mainak;

import com.mainak.faker.FakeAddress;
import com.mainak.faker.FakePersonal;
import com.mainak.faker.JFaker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to JFaker!");
        JFaker faker = new JFaker();

        /*
        // Test Fake Personal data generation
        FakePersonal fakePersonal = faker.personal();
        // Fake full name
        System.out.println("Name: " + fakePersonal.fullName());
        // Fake first name
        System.out.println("First name: " + fakePersonal.firstName());
        // Fake last name
        System.out.println("Last name: " + fakePersonal.lastName());
        // Fake username
        System.out.println("Username: " + fakePersonal.username());
        // Fake password
        System.out.println("Password: " + fakePersonal.password(8));
        // Fake email
        System.out.println("Email: " + fakePersonal.email());
        // Fake phone number
        System.out.println("Phone Number: " + fakePersonal.phoneNumber());
        // Fake date of birth
        System.out.println("Date of Birth: " + fakePersonal.dateOfBirth());
        */

        // Test Fake Address data generation
         FakeAddress fakeAddress = faker.address();
        // Fake street address
        System.out.println("Street Address: " + fakeAddress.street());
        // Fake city
        System.out.println("Street Address: " + fakeAddress.city());
        // Fake country
        System.out.println("Country: " + fakeAddress.country());
        // Fake state
        System.out.println("State: " + fakeAddress.state());
        // Fake zip code
        System.out.println("Zip Code: " + fakeAddress.zipCode());
        // Fake zip code with length
        System.out.println("Zip Code (6 digits): " + fakeAddress.zipCode(6));
        // Fake latitude
        System.out.println("Latitude: " + fakeAddress.latitude());
        // Fake longitude
        System.out.println("Longitude: " + fakeAddress.longitude());
    }
}