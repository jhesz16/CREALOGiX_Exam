package Pages;

import Data.CustomerData;

import static Pages.Base.getElement;

public class Dashboard {
    private final String logout = "//a[@title='Log me out']";
    private final String userName = "//span[text()='%s']";

    public boolean validateUserCreated(CustomerData customerData)
    {
        try
        {
            return getElement(logout).isDisplayed()&&
                    getElement(String.format(userName, customerData.getFirstName()+" "+customerData.getLastName())).isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }

    }

}
