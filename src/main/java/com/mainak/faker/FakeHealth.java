package com.mainak.faker;

public class FakeHealth {
    // Function to generate blood groups
    public String bloodGroup(){
        String[] bloodGroups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        return bloodGroups[(int)(Math.random() * bloodGroups.length)];
    }

    // Function to generate fake doctor names
    public String doctorName(){
        return "Dr. " + new FakePersonal().fullName();
    }

    // Function to generate disease names
    public String diseaseName(){
        String[] diseaseNames = {"Fever", "Cancer", "Asthma", "Alzheimer's disease", "Diabetes", "Hypertension", "Arthritis", "Depression", "Migraine", "Tuberculosis", "Hepatitis", "Malaria", "Dengue", "Cholera", "Ebola", "Zika virus", "COVID-19", "Influenza", "Pneumonia", "Measles", "Mumps", "Rubella", "Chickenpox", "Polio", "HIV/AIDS", "Syphilis", "Gonorrhea", "Chlamydia", "Herpes", "Cystic fibrosis", "Sickle cell anemia", "Hemophilia", "Leukemia", "Lymphoma", "Multiple sclerosis", "Parkinson's disease", "Epilepsy", "Autism spectrum disorder", "Attention deficit hyperactivity disorder (ADHD)", "Obsessive-compulsive disorder (OCD)", "Post-traumatic stress disorder (PTSD)", "Schizophrenia"};
        return diseaseNames[(int)(Math.random() * diseaseNames.length)];
    }

    // Function to generate fake hospital names
    public String hospitalName(){
        String[] hospitalNames = {"City Hospital", "General Hospital", "Mercy Hospital", "Saint Mary's Hospital", "County Hospital", "Memorial Hospital", "Central Hospital", "Community Hospital", "Regional Medical Center", "University Hospital", "Children's Hospital", "Veterans Hospital", "Heart Institute", "Cancer Center", "Rehabilitation Center", "Psychiatric Hospital", "Orthopedic Hospital", "Maternity Hospital", "Eye Institute", "Dental Clinic", "Urgent Care Center", "Trauma Center", "Dialysis Center", "Surgical Center", "Imaging Center", "Wellness Center", "Nursing Home", "Assisted Living Facility", "Hospice Care Center", "Physical Therapy Center", "Occupational Therapy Center", "Speech Therapy Center", "Chiropractic Clinic", "Acupuncture Clinic", "Holistic Health Center", "Alternative Medicine Clinic", "Integrative Medicine Center", "Pain Management Center", "Sleep Disorder Center", "Weight Loss Clinic", "Nutrition Center", "Fitness Center", "Hospital and Health Care", "Delhi Hospital", "AIIMS", "Apollo Hospital", "Fortis Hospital", "Max Healthcare", "Narayana Health", "Manipal Hospitals", "Medanta - The Medicity", "Columbia Asia Hospital", "BLK Super Speciality Hospital", "Lilavati Hospital", "Kokilaben Dhirubhai Ambani Hospital"};
        return hospitalNames[(int)(Math.random() * hospitalNames.length)];
    }
}
