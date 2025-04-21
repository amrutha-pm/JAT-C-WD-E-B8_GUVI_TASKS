package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quest_1 {
public static WebDriver driver ;   //Declared as global variable
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
try {
driver.manage().window().maximize();
//driver.get("https://jqueryui.com/datepicker/");
driver.navigate().to("https://jqueryui.com/datepicker/");
/*

//Switch to iframe by id or class name
WebElement iframe = driver.findElement(By.className("demo-frame"));
driver.switchTo().frame(iframe);
WebElement dateInput = driver.findElement(By.id("datepicker"));
dateInput.click(); // Opening to the datepicker 
//select next moth from date picker

*/

    driver.get("https://jqueryui.com/datepicker/");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  
    WebElement iframe = driver.findElement(By.className("demo-frame"));   // without wait
    driver.switchTo().frame(iframe);
  
                                                                                                                     
    WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker"))); //with wait -    
    // Wait for the input filed of datepicker- click it

    dateInput.click();

    WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-datepicker-next")));     
    // Wait for the next month button -click it

    nextButton.click();

    WebElement day22 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='15']")));       
    // Wait for a specific day - click it (22nd of next month)

    day22.click();
    //Get and print the selected date from the input field
    String selectedDate = dateInput.getAttribute("value");
    System.out.println("Selected Date is : " + selectedDate);
    System.out.println("Date from next month selected successfully");

} catch (Exception e) {
    e.printStackTrace();
} finally {
	Thread.sleep(5000);  //wait used just for viewing the report before closing
    driver.quit(); // Close the browser
}
}
	}
