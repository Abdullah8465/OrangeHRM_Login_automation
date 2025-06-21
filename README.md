# OrangeHRM_Login_automation
This project demonstrates web automation using Selenium WebDriver and Java by automating the login and logout process on the OrangeHRM demo site. It includes validation of the login panel visibility before performing login actions.

## Features
- Navigates to the OrangeHRM demo website
- Checks and prints the visibility of the login panel heading
- Automates login with valid credentials
- Performs logout after login
- Uses implicit waits and manages browser session

## Technologies Used
- Java
- Selenium WebDriver
- ChromeDriver

## How to Run
1. **Clone or download** this repository.
2. **Download the correct ChromeDriver** for your Chrome browser version and place it in the project folder.
3. **Add Selenium JAR files** to your project build path.
4. **Compile and run** the `Login.java` file from the `src/first_login` package.

## Credentials Used
- **Username:** Admin
- **Password:** Qedge123!@#

## Code Overview
// Checks if the login panel heading is visible and prints its text
String text = driver.findElement(By.id("logInPanelHeading")).getText();
boolean visible = driver.findElement(By.id("logInPanelHeading")).isDisplayed();
if (visible) {
System.out.println("Login panel heading is visible: " + text);
} else {
System.out.println("Login panel heading is NOT visible.");
}


## What I Learned
- Setting up and configuring Selenium WebDriver with Java
- Automating real-world login/logout scenarios
- Handling waits, browser sessions, and element visibility checks
- Writing clean, readable automation code

## Future Improvements
- Implementing Page Object Model (POM) for better code structure
- Parameterizing credentials for data-driven testing
- Adding exception handling and reporting

## Disclaimer
This project is for educational/demo purposes using the public OrangeHRM demo site.


