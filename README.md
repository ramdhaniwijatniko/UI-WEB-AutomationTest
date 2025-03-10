# UI Web Automation Test

## 📌 Overview
This project is an automated UI testing framework using **Java, Selenium, and Cucumber**. It follows the **Page Object Model (POM)** design pattern to enhance maintainability and scalability.

## 🚀 Technologies Used
- **Java** (JDK 11 or later)
- **Gradle** (Build Tool)
- **Cucumber** (For BDD testing)
- **Selenium WebDriver** (For UI automation)
- **JUnit** (For test execution)
- **ExtentReports** (For reporting)

## 📂 Project Structure
```
UI-Web-Automation-Test/
│── src/
│   ├── test/java/org/example/
│   │   ├── runners/  # Test Runners (CucumberTestRunner.java)
│   │   ├── stepdefinitions/  # Step Definitions (LoginSteps.java)
│   │   ├── pages/  # Page Object Model classes (LoginPage.java)
│   ├── test/resources/features/  # Cucumber Feature Files
│── build.gradle  # Gradle Configuration
│── README.md  # Project Documentation
│── reports/  # Test Reports
```

## 🔧 Setup & Installation
### Prerequisites
Ensure you have the following installed:
- **Java JDK 11+** ([Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html))
- **Gradle** ([Installation Guide](https://gradle.org/install/))
- **Google Chrome** (for UI testing)
- **Chromedriver** (matching your Chrome version, place in `drivers` folder)

### Clone the Repository
```sh
git clone https://github.com/your-username/ui-web-automation-test.git
cd ui-web-automation-test
```

### Running Tests
#### 🖥️ Running Cucumber Tests
```sh
gradle test
```

#### 📊 Generate Test Reports
After running the tests, reports will be available in the `reports/` folder.

## 🛠 Configuration
Modify `src/test/resources/config.properties` to update browser settings and test configurations:
```
browser = chrome
base.url = https://your-test-url.com
```

## 🏗️ CI/CD Integration
For **headless execution** in CI/CD pipelines:
```sh
gradle test -Dheadless=true
```

## 📢 Contribution
Feel free to fork this repository and submit a pull request! 🎉

## 📜 License
MIT License
