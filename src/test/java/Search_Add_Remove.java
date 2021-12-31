import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search_Add_Remove {

    @Test
    //public static void main(String[] args) throws InterruptedException {
        public void searchAddRemove () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.beymen.com/");
        driver.manage().window().maximize();

        System.out.println("Enter website");

        WebElement search = driver.findElement(By.cssSelector(".default-input"));
        search.sendKeys("pantolan");
        System.out.println("search write 'pantolan'");

        WebElement enter = driver.findElement(By.cssSelector(".default-input"));
        enter.sendKeys(Keys.ENTER);
        System.out.println("Enter key pressed");
        Thread.sleep(1000);

        WebElement product = driver.findElement(By.cssSelector(".m-productImageList__item"));
        product.click();
        System.out.println("Went to product");
        Thread.sleep(1000);

        WebElement select = driver.findElement(By.cssSelector("span[class='m-variation__item']"));
        select.click();
        System.out.println("Size selected");
        Thread.sleep(1000);

        WebElement added = driver.findElement(By.id("addBasket"));
        added.click();
        System.out.println("Added basket");
        Thread.sleep(1000);

        WebElement basket = driver.findElement(By.cssSelector(".icon-cart"));
        basket.click();
        System.out.println("went to cart");
        Thread.sleep(1000);

        Select dropdown = new Select(driver.findElement(By.id("quantitySelect0")));
        dropdown.selectByValue("2");
        System.out.println("Product number made two");
        Thread.sleep(1000);

        WebElement remove = driver.findElement(By.id("removeCartItemBtn0"));
        remove.click();
        System.out.println("Basket empty");

        Thread.sleep(3000);

        driver.close();
        System.out.println("Close Driver");







    }
}
