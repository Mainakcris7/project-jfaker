package com.mainak.faker;

public class FakeJob {
    // Function to generate fake job titles
    public String jobTitle() {
        String[] jobTitles = {"Software Engineer", "Data Scientist", "Product Manager", "Graphic Designer", "Marketing Specialist",
                "Sales Manager", "Business Analyst", "HR Coordinator", "Financial Advisor", "Customer Support" };
        return jobTitles[(int) (Math.random() * jobTitles.length)];
    }

    // Function to generate fake company names
    public String companyName() {
        String[] companyNames = {"Tech Solutions", "Innovatech", "Global Enterprises", "Creative Minds", "NextGen Corp",
                "Visionary Labs", "Dynamic Systems", "FutureWorks", "Pioneer Tech", "Synergy Inc", "Alpha Solutions", "Beta Innovations", "Gamma Enterprises", "Delta Dynamics", "Epsilon Tech",
                "Zeta Solutions", "Theta Innovations", "Iota Enterprises", "Kappa Dynamics", "Lambda Tech"};
        return companyNames[(int) (Math.random() * companyNames.length)];
    }

    // Function to generate fake industries
    public String industry() {
        String[] industries = {"Information Technology", "Healthcare", "Finance", "Education", "Manufacturing", "Retail", "Hospitality", "Transportation", "Construction", "Real Estate" };
        return industries[(int) (Math.random() * industries.length)];
    }

    // Function to generate fake salaries within range
    public double salary(int min, int max) {
        if (min < 0) min = 0;
        if (max <= min) max = min + 10000;
        return min + Math.round((Math.random() * (max - min)) * 100.0) / 100.0;
    }
}
