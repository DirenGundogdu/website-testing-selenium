import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_MoreBtn {

    @Test
    //public static void main(String[] args) throws InterruptedException {
      public void scrollMoreBtn () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.beymen.com/");
        driver.manage().window().maximize();
        System.out.println("Enter website");

        Thread.sleep(2000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,3750)");
        System.out.println("Scroll down");
        Thread.sleep(3000);

        WebElement moreBtn = driver.findElement(By.id("moreContentButton"));
        moreBtn.click();
        System.out.println("Click 'Daha Fazla' button");

        Thread.sleep(3000);

        driver.close();
        System.out.println("Close Driver");

    }
}
