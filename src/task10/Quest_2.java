package task10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest_2 {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();

        try {
        
            driver.get("https://jqueryui.com/droppable/");

            // Switch to the iframe 
            driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

            //  draggable and droppable elements
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            // initial color and text of the target element
            String initialColor = target.getCssValue("background-color");
            String initialText = target.getText();

            // Perform the drag-and-drop action
            Actions actions = new Actions(driver);
            actions.dragAndDrop(source, target).perform();

            //  final color and text of the target element after the drop
            String finalColor = target.getCssValue("background-color");
            String finalText = target.getText();

            // Validate - color has changed
            if (!initialColor.equals(finalColor)) {
                System.out.println("Color changed successfully");
            } else {
                System.out.println("No color Change");
            }

            // Validate - text has changed to "Dropped"
            if (finalText.equals("Dropped!")) {
                System.out.println("Text changed to 'Dropped!' successfully!");
            } else {
                System.out.println(" Text did not change to 'Dropped!'.");
            }

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the browser and end the WebDriver session
          //  driver.quit();
            System.out.println("Browser closed.");
        }
    }
}


