package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class FileUpload {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("https://the-internet.herokuapp.com/upload", "Chrome");
        WebElement fileUploadBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
        fileUploadBtn.sendKeys("C:\\Users\\bbond\\IdeaProjects\\SDETJavaBatch16\\Files\\Config.properties");
    }
}
