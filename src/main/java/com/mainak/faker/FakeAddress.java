package com.mainak.faker;

public class FakeAddress {
    // Function to generate random street value as fake dat
    public String street() {
        String[] streets = { "Main St", "High St", "Park Ave", "Oak St", "Pine St", "Maple St", "Cedar St", "Elm St",
                "Washington St", "Lake St", "Hill St", "Sunset Blvd", "Broadway", "1st Ave", "2nd Ave", "3rd Ave",
                "4th Ave", "5th Ave", "6th Ave", "7th Ave", "8th Ave", "9th Ave", "10th Ave", "Church St", "River Rd",
                "Market St", "Center St", "Chestnut St", "Walnut St", "Spruce St", "Birch St", "Willow St",
                "Ash St", "Poplar St", "Sycamore St", "Dogwood St", "Magnolia St", "Hickory St", "Locust St",
                "Cottonwood St", "Juniper St", "Cypress St", "Palm St" };
        return streets[(int) (Math.random() * streets.length)];
    }

    // Function to generate random city value as fake data
    public String city() {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Mumbai", "Delhi", "Bangalore", "Kolkata", "Chennai", "Karachi", "Lahore", "Dhaka", "Cairo", "Lagos", "Kinshasa", "Johannesburg", "London", "Berlin", "Madrid", "Rome", "Paris", "Moscow", "Istanbul", "Tokyo", "Seoul", "Beijing", "Shanghai", "Toronto", "Vancouver",
                "Dallas", "San Jose", "Austin", "Jacksonville", "Fort Worth", "Columbus", "Charlotte", "San Francisco",
                "Indianapolis", "Seattle", "Denver", "Washington", "Boston", "El Paso", "Nashville", "Detroit", "Oklahoma City",
                "Portland", "Las Vegas", "Memphis", "Louisville", "Baltimore", "Milwaukee", "Albuquerque", "Tucson", "Fresno"};
        return cities[(int) (Math.random() * cities.length)];
    }

    // Function to generate random state value as fake data
    public String state() {
        String[] states = {"California", "Texas", "Florida", "New York", "Illinois", "Pennsylvania", "Ohio", "Georgia", "North Carolina", "Michigan", "New Jersey", "Virginia", "Washington", "Arizona", "Massachusetts", "Tennessee", "Indiana", "Missouri", "Maryland", "Wisconsin", "Colorado", "Minnesota", "South Carolina", "Alabama", "Louisiana", "Kentucky", "Oregon", "Oklahoma", "Connecticut", "Iowa", "Utah", "Nevada", "West Bengal", "Maharashtra", "Tamil Nadu", "Karnataka", "Gujarat", "Rajasthan", "Uttar Pradesh", "Punjab", "Haryana", "Bihar", "Assam", "Kerala", "West Africa", "East Africa", "Southern Africa", "Northern Africa", "Central Africa", "England", "Scotland", "Wales", "Northern Ireland", "Bavaria", "Saxony", "Hesse", "Brandenburg", "Catalonia", "Andalusia", "Galicia", "Basque Country", "Lombardy", "Sicily", "Veneto"};
        return states[(int) (Math.random() * states.length)];
    }

    // Function to generate random country value as fake data
    public String country() {
        String[] countries = {"United States", "Canada", "Mexico", "Brazil", "Argentina", "United Kingdom", "Germany", "France", "Italy", "Spain", "Russia", "China", "India", "Japan", "South Korea", "Australia", "New Zealand", "South Africa", "Nigeria", "Egypt", "Kenya", "Turkey", "Saudi Arabia", "United Arab Emirates", "Indonesia", "Thailand", "Vietnam", "Philippines", "Malaysia", "Singapore", "Pakistan", "Bangladesh", "Sri Lanka", "Nepal", "Bhutan", "Maldives" };
        return countries[(int) (Math.random() * countries.length)];
    }

    // Function to generate random zip code value as fake data
    public String zipCode() {
        int zip = (int) (Math.random() * 90000) + 10000;
        return String.valueOf(zip);
    }

    // Generate zipcode of given length
    public String zipCode(int length) {
        StringBuilder zip = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int digit = (int) (Math.random() * 10);
            zip.append(digit);
        }
        return zip.toString();
    }

    // Function to generate random latitude value as fake data
    public double latitude(){
        boolean isNegative = Math.random() < 0.5;
        if(isNegative){
            return Math.random() * -90;
        }
        return Math.random() * 90;
    }

    // Function to generate random longitude value as fake data
    public double longitude(){
        boolean isNegative = Math.random() < 0.5;
        if(isNegative){
            return Math.random() * -180;
        }
        return Math.random() * 180;
    }
}
