package Pages;

import static Pages.Base.getElement;

public class CreateAccount {
    public final String emailField = "//input[@id='email_create']";
    public final String createAnAccountButton = "//*[@id='SubmitCreate']/span";

    public void setEmailField(String val)
    {
        getElement(emailField).sendKeys(val);
    }

    public void clickCreateAnAccountButton()
    {
        getElement(createAnAccountButton).click();
    }
}
