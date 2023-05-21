package class01.HWclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Brett");
        driver.findElement(By.id("customer.lastName")).sendKeys("Bond");
        driver.findElement(By.id("customer.address.street")).sendKeys("345 Elm Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Memphis");
        driver.findElement(By.id("customer.address.state")).sendKeys("TN");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("38133");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9018675309");
        driver.findElement(By.id("customer.ssn")).sendKeys("255-55-5555");
        driver.findElement(By.id("customer.username")).sendKeys("bbond");
        driver.findElement(By.id("customer.password")).sendKeys("pass123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("pass123");

        Thread.sleep(5000);
        driver.quit();

    }
}
