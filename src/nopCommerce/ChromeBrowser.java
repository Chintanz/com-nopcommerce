package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        //Setup chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Maximise Browser
        driver.manage().window().maximize();
        //We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the page title
        String title = driver.getTitle();
        System.out.println("This is the page title: " + title);

        //Print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current url: " + url);

        //Print the page source
        System.out.println("Page source" + driver.getPageSource());

        //Enter the email to email field
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        driver.findElement(By.id("Email")).sendKeys("chintaaan@yahoo.com");

        //Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("Chintz2023");

        //Close the browser
        driver.close();




    }
}
