package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

import static utils.CommonMethods.driver;

public class Tables {
    public static void main(String[] args) {

        CommonMethods.openBrowserToURL("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html", "Chrome");
        WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String allText = wholeTable.getText();
        System.out.println(allText);

        System.out.println("*****************************");

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : allRows) {
            String rowText = row.getText();
            if (rowText.contains("Google")) System.out.println(row.getText());
        }

        System.out.println("*******************************");

        List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement data : allData) {
            System.out.println(data.getText());
        }
    }
}
