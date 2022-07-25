package Pages;

import Data.CustomerData;
import Pages.Enums.Genders;

import static Pages.Base.getElement;
import static Pages.Base.getSelectElement;

public class PersonalInformation {


    private final String id_gender = "//*[@name='id_gender' and @value=%s]";
    private final String customer_firstname = "//*[@name='customer_firstname']";
    private final String customer_lastname = "//*[@name='customer_lastname']";
    private final String email = "//*[@name='email']";
    private final String passwd = "//*[@name='passwd']";
    private final String days = "//*[@id='days']";
    private final String months = "//*[@id='months']";
    private final String years = "//*[@id='years']";
    private final String firstname = "//*[@name='firstname']";
    private final String lastname = "//*[@name='lastname']";
    private final String company = "//*[@name='company']";
    private final String address1 = "//*[@name='address1']";
    private final String address2 = "//*[@name='address2']";
    private final String city = "//*[@name='city']";
    private final String state = "//*[@id='id_state']";
    private final String postcode = "//*[@name='postcode']";
    private final String country = "//*[@id='id_country']";
    private final String phone = "//*[@name='phone']";
    private final String phone_mobile = "//*[@name='phone_mobile']";
    private final String alias = "//*[@name='alias']";
    private final String register = "//*[@id='submitAccount']";


    public void fill(CustomerData customerData)
    {
        setTitle(customerData.getTitle());
        setSendKeysValue(customer_firstname,customerData.getFirstName());
        setSendKeysValue(customer_lastname,customerData.getLastName());
        setSendKeysValue(email,customerData.getEmail());
        setSendKeysValue(passwd,customerData.getPassword());
        setBirthDate(customerData.getDateOfBirth());
        setSendKeysValue(firstname,customerData.getFirstName());
        setSendKeysValue(lastname,customerData.getLastName());
        setSendKeysValue(company,customerData.getCompany());
        setSendKeysValue(address1,customerData.getAddress1());
        setSendKeysValue(address2,customerData.getAddress2());
        setSendKeysValue(city,customerData.getCity());
        setSendKeysValue(state,customerData.getState());
        setSendKeysValue(postcode,customerData.getZip());
        setSendKeysValue(country,customerData.getCountry());
        setSendKeysValue(phone,customerData.getHomePhoneNumber());
        setSendKeysValue(phone_mobile,customerData.getMobilePhoneNumber());
        setSendKeysValue(alias,customerData.getAlias());


    }

    public void setBirthDate(String val)
    {
        String[] arr = val.split("/");
        getSelectElement(days).selectByValue(arr[0]);
        getSelectElement(months).selectByValue(arr[1]);
        getSelectElement(years).selectByValue(arr[2]);

    }

    public void setSendKeysValue(String locator,String val)
    {
        try {
            getElement(locator).clear();
        }
        catch (Exception e){}

        getElement(locator).sendKeys(val);

    }

    public void setTitle(Genders val)
    {
        switch (val)
        {
            case MR:
            {
                getElement(String.format(id_gender,1)).click();
                break;
            }
            case MS:
            {
                getElement(String.format(id_gender,2)).click();
                break;
            }
        }
    }

    public void clickRegister()
    {
        getElement(register).click();
    }

}