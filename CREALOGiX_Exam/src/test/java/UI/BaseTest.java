package UI;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest extends Base {
    public final String URL = "http://automationpractice.com/index.php";
    protected WebDriver driver;

    public Home home;
    public CreateAccount createAccount;
    public PersonalInformation personalInformation;
    public Dashboard dashboard;

    BaseTest() {
        driver = getDriver();
        driver.get(URL);
        wait = new WebDriverWait(driver, 30);
        init();
    }


    public void init() {
        home = new Home();
        createAccount = new CreateAccount();
        personalInformation = new PersonalInformation();
        dashboard = new Dashboard();
    }
}
