package UI;

import Data.CustomerData;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class UITest extends BaseTest {

    @Test
    public void UI_E2E() {
        CustomerData customerData = new CustomerData().genericData();
        customerData.setEmail("bbabaavaaaaa@bbb.com");
        home.clickSignIn();
        createAccount.setEmailField(customerData.getEmail());
        createAccount.clickCreateAnAccountButton();
        personalInformation.fill(customerData);
        personalInformation.clickRegister();
        Assert.assertTrue(dashboard.validateUserCreated(customerData));
    }

    @AfterTest
    public void teardown() {
        driver.close();
        driver.quit();
    }
}
