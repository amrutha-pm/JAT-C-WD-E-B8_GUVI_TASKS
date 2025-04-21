package task11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Quest1_windowHandle {
public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        
        try {
          
            driver.get("https://the-internet.herokuapp.com/windows");
            
            //  Click on the "Click Here" button to open the new window
            WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
            clickHereButton.click();
            
            //  Store the current window handle (original window)
            String originalWindow = driver.getWindowHandle();
            
            // Wait for the new window to appear
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Updated to use Duration
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            // Switch to the new window
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            
            // Verify that the new window text is present
            String newWindowText = driver.getPageSource();
            if (newWindowText.contains("New Window")) {
                System.out.println("New window text is present on the page.");
            } else {
                System.out.println("New window text is NOT present on the page.");
            }
            
            //  Close the new window
            driver.close();
            
            // Switch back to the original window
            driver.switchTo().window(originalWindow);
            Thread.sleep(3000);
            // Verify that original window is active
            if (driver.getTitle().contains("The Internet")) {
                System.out.println("Original window is now active.");
            } else {
                System.out.println("Failed to switch back to the original window.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //  Close the browser
        	Thread.sleep(5000);
            driver.quit();
        }
    }
}
