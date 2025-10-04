# JFaker - A Simple Java Fake Data Generator 🍵😁

JFaker is a simple Java library for generating realistic fake data for testing, prototyping, and development. It focuses on simplicity and ease of use, allowing developers to quickly generate data for a wide range of domains without complex setup or configuration.

## Why JFaker? 🤔

Testing without fake data generation can be a burden. Developers often spend valuable time manually creating mock data, which is repetitive, error-prone, and rarely covers all edge cases. JFaker solves this issue by providing ready-to-use methods for generating fake addresses, commerce details, dates, education info, entertainment data, finance records, health info, internet data, job details, and personal information. This enables rapid, robust, and realistic testing, freeing you from the tedium of manual data creation.

## Features ✨
- Simple API for generating fake data
- Covers a wide range of domains
- No external dependencies
- Customizable output

## Getting Started 🚀

Add the source files to your Java project and instantiate the `JFaker` class:

```java
import com.mainak.faker.JFaker;

JFaker faker = new JFaker();
String city = faker.address().city();
String product = faker.commerce().productName();
LocalDate randomDate = faker.date().past(30);
String doctor = faker.health().doctorName();
```

## Cloning the Repository 🛠️

To get started, clone the JFaker repository using:
```cmd
git clone https://github.com/Mainakcris7/project-jfaker.git
```
Replace `<repository-url>` with the actual URL of your JFaker repository.

## Installation (Local Setup) 🏗️

After cloning the repository, follow these steps to set up JFaker locally:

1. **Ensure you have Java (JDK 8+).**
2. Open a terminal in the `jfaker` directory.
3. Run the following command to build and install the project:
   ```cmd
   ./gradlew clean build publishToMavenLocal
   ```
   This will clean previous builds, compile the source code, run tests, and install the library locally.

## Using JFaker in Other Java Projects 🔗

After installing JFaker in your local repository with `./gradlew clean build publishToMavenLocal`, you can use it in any other Java project by declaring it as a dependency.

### For Gradle projects
Make sure your `repositories` block includes `mavenLocal()`:
```groovy
repositories {
    mavenLocal()
    mavenCentral()
}
```
Then, add `JFaker` as a dependency in your `build.gradle`:

```groovy
dependencies {
    implementation 'com.mainak:jfaker:1.0-SNAPSHOT'
}
```

### For Maven projects
Add the following to your `pom.xml`:
```xml
<dependency>
    <groupId>com.mainak</groupId>
    <artifactId>jfaker</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

Once added, you can import and use JFaker classes in your code as shown in the example usage section.

## Documentation 📚

### JFaker 🧰
Central entry point. Provides access to all fake data generators:
- `address()`: Returns `FakeAddress` object.
- `commerce()`: Returns `FakeCommerce` object.
- `date()`: Returns `FakeDate` object.
- `education()`: Returns `FakeEducation` object.
- `entertainment()`: Returns `FakeEntertainment` object.
- `finance()`: Returns `FakeFinance` object.
- `health()`: Returns `FakeHealth` object.
- `internet()`: Returns `FakeInternet` object.
- `job()`: Returns `FakeJob` object.
- `personal()`: Returns `FakePersonal` object.

---

### FakeAddress 🏠
- `street()`: Random street name
- `city()`: Random city name
- `state()`: Random state name
- `country()`: Random country name
- `zipCode()`: Random 5-digit zip code
- `zipCode(int length)`: Random zip code of given length

### FakeCommerce 🛒
- `productName()`: Random product name
- `productCategory()`: Random product category
- `productBrand()`: Random brand name
- `price(int min, int max)`: Random price in range
- `discountCode(int length)`: Random discount code

### FakeDate 📅
- `between(LocalDate start, LocalDate end)`: Random date between two dates
- `past(int days)`: Random date in the past N days
- `future(int days)`: Random date in the next N days
- `time()`: Random time

### FakeEducation 🎓
- `schoolName()`: Random school name
- `universityName()`: Random university name
- `degree()`: Random degree
- `course()`: Random course

### FakeEntertainment 🎬
- `movieName()`: Random movie name
- `bookTitle()`: Random book title
- `songName()`: Random song name
- `characterName()`: Random character name
- `gameTitle()`: Random game title
- `cricketer()`: Random cricketer name
- `footballer()`: Random footballer name

### FakeFinance 💳
- `creditCardNumber()`: Random credit card number
- `iban()`: Random IBAN
- `transactionId(int length)`: Random transaction ID

### FakeHealth 🏥
- `bloodGroup()`: Random blood group
- `doctorName()`: Random doctor name
- `diseaseName()`: Random disease name
- `hospitalName()`: Random hospital name

### FakeInternet 🌐
- `domainName()`: Random domain name
- `ipv4Address()`: Random IPv4 address
- `ipv6Address()`: Random IPv6 address
- `macAddress()`: Random MAC address
- `url()`: Random URL

### FakeJob 💼
- `jobTitle()`: Random job title
- `companyName()`: Random company name
- `industry()`: Random industry
- `salary(int min, int max)`: Random salary in range

### FakePersonal 👤
- `fullName()`: Random full name
- `firstName()`: Random first name
- `lastName()`: Random last name
- `username()`: Random username
- `password(int length)`: Random password
- `email()`: Random email address

---

## Example Usage 📝
```java
JFaker faker = new JFaker();
System.out.println(faker.address().city());
System.out.println(faker.commerce().productName());
System.out.println(faker.date().future(10));
System.out.println(faker.health().doctorName());
System.out.println(faker.personal().email());
```

## Contact 📧
For questions, suggestions, or contributions, please open an issue or submit a pull request on the GitHub repository or mail me at mainakcr72002@gmail.com
