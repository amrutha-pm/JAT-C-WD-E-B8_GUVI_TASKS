package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Quest2_NestedFrames {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        try {
            driver.get("http://the-internet.herokuapp.com/nested_frames");

            // Switch to the top frame
            driver.switchTo().frame("frame-top");

            // Count frames inside top frame
            int numberOfFrames = driver.findElements(By.tagName("frame")).size();
            if (numberOfFrames == 3) {
                System.out.println("There are three frames on the page.");
            } else {
                System.out.println("The number of frames is not 3.");
            }

            // LEFT frame
            driver.switchTo().frame("frame-left");
            System.out.println("The left frame has the text '" + driver.findElement(By.tagName("body")).getText() + "'.");
            driver.switchTo().parentFrame();

            // MIDDLE frame
            driver.switchTo().frame("frame-middle");
            System.out.println("The middle frame has the text '" + driver.findElement(By.tagName("body")).getText() + "'.");
            driver.switchTo().parentFrame();

            // RIGHT frame
            driver.switchTo().frame("frame-right");
            System.out.println("The right frame has the text '" + driver.findElement(By.tagName("body")).getText() + "'.");
            
            // Back to main page to access bottom frame
            driver.switchTo().defaultContent(); // <-- This is critical!

            // Switch to bottom frame (it's a sibling of frame-top)
            driver.switchTo().frame("frame-bottom");
            String bottomText = driver.findElement(By.tagName("body")).getText();
            if (bottomText.contains("BOTTOM")) {
                System.out.println("The bottom frame has the text 'BOTTOM'.");
            } else {
                System.out.println("The bottom frame does not have the text 'BOTTOM'.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
