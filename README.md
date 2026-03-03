# 🚀 Selenium TestNG Automation Framework

A scalable, maintainable, and thread-safe UI automation framework built using **Selenium WebDriver, Java, TestNG, and Maven**.

---

## 📌 Tech Stack

- Java 17
- Selenium WebDriver 4
- TestNG
- Maven
- WebDriverManager
- Page Object Model (POM)
- ThreadLocal (Parallel Execution Support)

---

## 🏗 Framework Architecture

This framework follows industry-standard automation architecture:

- ✅ Page Object Model (POM) design pattern
- ✅ DriverFactory with ThreadLocal for parallel execution
- ✅ Config-driven execution using `config.properties`
- ✅ Reusable utility classes (Screenshot Utility)
- ✅ TestNG XML-based test execution
- ✅ Maven dependency management

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   ├── base
│   │   ├── factory
│   │   ├── pages
│   │   ├── utils
│   └── resources
│       └── config.properties
└── test
    └── java
        └── tests
```

---

## ⚙ Features

✔ Thread-safe WebDriver implementation  
✔ Parallel test execution support  
✔ Multi-browser support (Chrome configurable)  
✔ Configurable implicit waits  
✔ Screenshot capture utility  
✔ Clean separation of concerns  
✔ Scalable framework design

---

## ▶ How To Run

### Option 1: Using TestNG XML

1. Clone the repository
2. Update `config.properties` if needed
3. Right-click `testng.xml` → Run

### Option 2: Using Maven

```
mvn clean test
```

---

## 🧪 Sample Test Scenarios

- Login functionality validation
- Negative login validation
- Screenshot capture on test execution

---

## 📈 Future Enhancements

- Integrate Extent Reports
- Add CI/CD integration (GitHub Actions / Jenkins)
- Docker-based execution
- Allure reporting integration
- Data-driven framework support

---

## 👨‍💻 Author

Built as part of hands-on practice to design an enterprise-level Selenium automation framework.