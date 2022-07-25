package Data;

import Pages.Enums.Genders;

import static Pages.Enums.Genders.MR;

public class CustomerData {

    Genders title = MR;
    String firstName = "JC";
    String lastName = "Martin";
    String email = "aasaasaaaaa@aaa.com";
    String password = "P@ssword123@";
    String dateOfBirth = "31/1/1988";
    String company = "Apple";
    String address1 = "address1";
    String address2 = "address2";
    String city = "TestCity";
    String state = "California";
    String zip = "90210";
    String country = "United States";
    String homePhoneNumber = "999-999-9999";
    String mobilePhoneNumber = "999-999-9999";
    String alias = "My Address";
    public CustomerData(Genders title, String firstName, String lastName, String email, String password, String dateOfBirth,
                        String company, String address1, String address2, String city,String state, String zip, String country,
                        String homePhoneNumber, String mobilePhoneNumber, String alias) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.alias = alias;
    }

    public CustomerData() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Genders getTitle() {
        return title;
    }

    public void setTitle(Genders title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CustomerData genericData()
    {
        return new CustomerData(title, firstName, lastName, email,password,
                dateOfBirth, company, address1, address2,city, state,
                zip, country, homePhoneNumber, mobilePhoneNumber, alias);
    }
}
