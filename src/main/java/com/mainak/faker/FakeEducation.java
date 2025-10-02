package com.mainak.faker;

public class FakeEducation {
    // Function to generate fake school names
    public String schoolName() {
        String[] schoolNames = {"Springfield High School", "Riverdale Academy", "Greenwood International School", "Sunrise Public School", "Maple Leaf Academy",
                "Oakridge International School", "St. Mary's High School", "Hillside Academy", "Cedar Valley School", "Lakeside High School",
                "Delhi Public School", "The British School", "International Grammar School & College", "American International School", "Canadian International School",
                "Tokyo International School", "Seoul Foreign School", "Beijing World Youth Academy", "Shanghai American School", "Hong Kong International School",
                "Eton College", "Harrow School", "Westminster School", "Raffles Institution", "Indian High School"};
        return schoolNames[(int) (Math.random() * schoolNames.length)];
    }

    // Function to generate fake university names
    public String universityName() {
        String[] universityNames = {"Harvard University", "Stanford University", "Massachusetts Institute of Technology", "University of Cambridge", "University of Oxford",
                "California Institute of Technology", "Princeton University", "Yale University", "Columbia University", "University of Chicago",
                "University of Delhi", "Indian Institute of Technology Bombay", "Indian Institute of Science", "University of Mumbai", "Jawaharlal Nehru University",
                "University of Tokyo", "Kyoto University", "Seoul National University", "Peking University", "Tsinghua University",
                "University of Edinburgh", "University of Manchester", "London School of Economics", "University of Sydney", "University of New South Wales"};
        return universityNames[(int) (Math.random() * universityNames.length)];
    }

    // Function to generate fake degrees
    public String degree() {
        String[] degrees = {"Bachelor of Science", "Bachelor of Arts", "Bachelor of Commerce", "Bachelor of Engineering", "Bachelor of Technology",
                "Master of Science", "Master of Arts", "Master of Business Administration", "Master of Engineering", "Master of Technology",
                "Doctor of Philosophy", "Doctor of Medicine", "Doctor of Dental Surgery", "Doctor of Veterinary Medicine", "Doctor of Education"};
        return degrees[(int) (Math.random() * degrees.length)];
    }

    // Function to generate fake courses
    public String course() {
        String[] courses = {"Computer Science", "Business Administration", "Mechanical Engineering", "Electrical Engineering", "Civil Engineering",
                "Psychology", "Economics", "Biology", "Chemistry", "Physics",
                "Mathematics", "History", "Political Science", "Sociology", "Philosophy",
                "Medicine", "Dentistry", "Veterinary Science", "Education", "Law", "Architecture", "Environmental Science"};
        return courses[(int) (Math.random() * courses.length)];
    }
}
