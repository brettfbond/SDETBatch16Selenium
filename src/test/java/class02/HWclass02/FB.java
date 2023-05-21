package class02.HWclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Brett");
        driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Bond");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("brettbond@email.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("brettbond@email.com");
        driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("pass123");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Nov");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1985");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
