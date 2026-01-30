package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

public class RegistrationTest {

    WebDriver driver;
    String appUrl = "C:\\Users\\NIKHI\\OneDrive\\Desktop\\Development\\Frugal Testing\\Registration-System\\frontend\\index.html";

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get(appUrl);

        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
    }

    // 🔴 NEGATIVE TEST CASE
    @Test(priority = 1)
    public void negativeScenario_MissingLastName() throws Exception {

        driver.findElement(By.id("firstName")).sendKeys("Nikhil");
        driver.findElement(By.id("email")).sendKeys("nikhil@test.com");

        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("state")).sendKeys("Bihar");
        driver.findElement(By.id("city")).sendKeys("Patna");

        driver.findElement(By.id("password")).sendKeys("testing123");
        driver.findElement(By.id("confirmPassword")).sendKeys("testing123");

        driver.findElement(By.id("terms")).click();

        driver.findElement(By.id("submitBtn")).click();

        takeScreenshot("error-state.png");
    }

    // 🟢 POSITIVE TEST CASE
    @Test(priority = 2)
    public void positiveScenario_ValidRegistration() throws Exception {

        driver.navigate().refresh();

        driver.findElement(By.id("firstName")).sendKeys("Nikhil");
        driver.findElement(By.id("lastName")).sendKeys("Singh");
        driver.findElement(By.id("email")).sendKeys("nikhil@test.com");

        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("state")).sendKeys("Bihar");
        driver.findElement(By.id("city")).sendKeys("Patna");

        driver.findElement(By.id("password")).sendKeys("testing123");
        driver.findElement(By.id("confirmPassword")).sendKeys("testing123");

        driver.findElement(By.id("terms")).click();

        driver.findElement(By.id("submitBtn")).click();

        takeScreenshot("success-state.png");
    }

    // 📸 Screenshot Utility
    public void takeScreenshot(String fileName) throws Exception {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("../screenshots/" + fileName);
        Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
