# Registration System Automation Testing

## 📌 Project Overview
This project is an intelligent Registration System with client-side validations and complete UI automation using Selenium WebDriver.
The project demonstrates both negative and positive test scenarios as required for the Frugal Testing Software Engineer role.

---

## 🧰 Tech Stack
- HTML, CSS, JavaScript
- Java
- Selenium WebDriver
- TestNG
- Maven
- Eclipse IDE

---

## 📂 Project Structure
```
Registration-System/
│
├── frontend/
│ ├── index.html
│ ├── style.css
│ └── script.js
│
├── automation/
│ ├── pom.xml
│ └── src/test/java/tests/RegistrationTest.java
│
├── screenshots/
│ ├── error-state.png
│ └── success-state.png
│
└── README.md
```

---

## 🧪 Automated Test Scenarios

### 🔴 Negative Scenario
- Last Name field left blank
- Validation error displayed
- Screenshot captured

### 🟢 Positive Scenario
- All mandatory fields filled with valid data
- Registration successful
- Screenshot captured

---

## ▶️ How to Run the Automation
1. Open the project in Eclipse
2. Navigate to:
   automation/src/test/java/tests/RegistrationTest.java
3. Update the local path of index.html if required
4. Right click → Run As → TestNG Test

---

## 📸 Test Evidence
Screenshots are automatically saved in the screenshots folder after test execution.
![alt text](<Screenshot 2026-01-31 020729.png>) ![alt text](<Screenshot 2026-01-31 020653.png>)

---
## 📄 SOFTWARE TEST AUTOMATION REPORT
(Section A – Option 2: Intelligent Registration System)

## 1. Project Information
Field	Details
Project Name	Intelligent Registration System
Test Type	UI Automation Testing
Automation Tool	Selenium WebDriver
Language	Java
Framework	TestNG
Build Tool	Maven
IDE	Eclipse
Tester Name	Nikhil Kumar Singh
Date	(put submission date)

## 2. Objective of Testing
The objective of this testing activity is to validate the functionality, usability, and reliability of the Registration System by automating both negative and positive user scenarios using Selenium WebDriver.

The automation focuses on:

Validating mandatory fields

Verifying form logic

Ensuring correct error and success messages

Capturing test evidence through screenshots

## 3. Application Under Test (AUT)
Application Type: Web-based Registration Form

Key Features Tested:

Client-side form validation

Dynamic Country → State → City dropdowns

Password and Confirm Password validation

Submit button enable/disable logic

Success and error messages

## 4. Test Environment
Component	Details
Operating System	Windows
Browser	Google Chrome
Automation Tool	Selenium WebDriver
Java Version	Java 8 / 11
Build Tool	Maven

## 5. Test Scenarios Covered
🔴 Test Case 1: Negative Scenario – Missing Last Name
Field	Description
Test Case ID	TC_001
Test Scenario	Validate error when Last Name is missing
Steps	1. Launch application
2. Fill all fields except Last Name
3. Click Submit
Expected Result	Error message displayed for Last Name
Actual Result	Error message displayed
Status	Pass

📸 Screenshot: error-state.png

🟢 Test Case 2: Positive Scenario – Successful Registration
Field	Description
Test Case ID	TC_002
Test Scenario	Validate successful registration
Steps	1. Fill all fields with valid data
2. Accept Terms & Conditions
3. Click Submit
Expected Result	Success message displayed and form reset
Actual Result	Registration successful
Status	Pass

📸 Screenshot: success-state.png

🧠 Test Case 3: Form Logic Validation
Field	Description
Test Case ID	TC_003
Test Scenario	Validate dynamic dropdown & password logic
Steps	1. Change Country → State updates
2. Change State → City updates
3. Enter mismatched passwords
Expected Result	Dropdown updates & validation errors
Actual Result	Behavior as expected
Status	Pass

## 6. Automation Execution Details
Automation executed using Selenium WebDriver with TestNG

Tests executed through Eclipse IDE

Page URL and Title printed in console logs

Screenshots captured automatically during execution

Test execution recorded using screen recording tool

## 7. Defects Found
Defect ID	Description	Status
N/A	No defects found during automation execution	Closed

## 8. Conclusion
The automated testing successfully validated all critical functionalities of the Registration System.
Both negative and positive scenarios executed as expected, confirming the stability and correctness of the application.

The automation solution demonstrates a strong testing approach with proper validations, evidence capture, and maintainable test structure.

## 9. Attachments
Selenium Automation Code (GitHub Repository - https://github.com/Nikhil-1221/Registration-System-Automation/tree/main/automation)

Screenshots (error-state.png, success-state.png)

Screen Recording of Test Execution
---
👤 Tester Signature
Nikhil Kumar Singh

## 👤 Author
Nikhil Kumar Singh
