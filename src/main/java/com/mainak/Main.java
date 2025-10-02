package com.mainak;

import com.mainak.faker.*;

import java.time.LocalDate;

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

        /*
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
         */

        /*
        FakeFinance fakeFinance = faker.finance();
        // Fake credit card number
        System.out.println("Credit Card Number: " + fakeFinance.creditCardNumber());
        // Fake IBAN number
        System.out.println("IBAN: " + fakeFinance.iban());
        // Fake transaction ID
        System.out.println("Transaction ID: " + fakeFinance.transactionId(16));
        // Fake currency code
        System.out.println("Currency Code: " + fakeFinance.currencyCode());
        // Fake price
        System.out.println("Price: " + fakeFinance.price(100, 1000));
         */

        /*
        FakeInternet fakeInternet = faker.internet();
        // Fake domain name
        System.out.println("Domain Name: " + fakeInternet.domainName());
        // Fake IPv4 address
        System.out.println("IPv4 Address: " + fakeInternet.ipv4Address());
        // Fake IPv6 address
        System.out.println("IPv6 Address: " + fakeInternet.ipv6Address());
        // Fake MAC address
        System.out.println("MAC Address: " + fakeInternet.macAddress());
        // Fake URL
        System.out.println("URL: " + fakeInternet.url());
         */

        /*
        FakeJob fakeJob = faker.job();
        // Fake job title
        System.out.println("Job Title: " + fakeJob.jobTitle());
        // Fake company name
        System.out.println("Company Name: " + fakeJob.companyName());
        // Fake industry
        System.out.println("Industry: " + fakeJob.industry());
        // Fake salary
        System.out.println("Salary: " + fakeJob.salary(50000, 150000));
         */

        /*
        FakeCommerce fakeCommerce = faker.commerce();
        // Fake product name
        System.out.println("Product Name: " + fakeCommerce.productName());
        // Fake product category
        System.out.println("Product Category: " + fakeCommerce.productCategory());
        // Fake product brand
        System.out.println("Product Brand: " + fakeCommerce.productBrand());
        // Fake price
        System.out.println("Price: " + fakeCommerce.price(50, 500));
        // Fake discount code
        System.out.println("Discount Code: " + fakeCommerce.discountCode(10));
        */

        FakeDate fakeDate = faker.date();
        // Fake date between two dates
        System.out.println("Date Between: " + fakeDate.between(LocalDate.of(2000, 1, 1), LocalDate.of(2020, 12, 31)));
        // Fake past date within last n days
        System.out.println("Past Date: " + fakeDate.past(1000));
        // Fake future date within next n days
        System.out.println("Future Date: " + fakeDate.future(1000));
        // Fake time
        System.out.println("Time: " + fakeDate.time());

    }
}