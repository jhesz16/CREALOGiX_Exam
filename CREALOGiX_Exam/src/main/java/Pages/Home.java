package Pages;

import static Pages.Base.getElement;

public class Home {
    public final String signIn = "//a[@class='login']";

    public void clickSignIn() {
        getElement(signIn).click();
    }

}
