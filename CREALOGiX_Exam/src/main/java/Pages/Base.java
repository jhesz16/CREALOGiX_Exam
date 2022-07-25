package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    static WebDriver driver;
    protected static WebDriverWait wait;

    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static WebElement getElement(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public static Select getSelectElement(String locator) {
        return new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))));
    }
}
