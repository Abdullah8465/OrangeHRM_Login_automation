package first_login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Prepare browser session
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Open OrangeHRM demo site
        driver.get("http://orangehrm.qedgetech.com");

        // Validate login panel visibility and print heading
        String text = driver.findElement(By.id("logInPanelHeading")).getText();
        boolean visible = driver.findElement(By.id("logInPanelHeading")).isDisplayed();
        if (visible) {
            System.out.println("Login panel heading is visible: " + text);
        } else {
            System.out.println("Login panel heading is NOT visible.");
        }

        // Perform login and logout actions
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.partialLinkText("Welcome")).click();
        driver.findElement(By.linkText("Logout")).click();

        // Close browser
        driver.close();
    }
}
