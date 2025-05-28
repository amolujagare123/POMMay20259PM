package regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;

import java.io.IOException;

import static Utility.ForDataProvider.getMyData;
import static Utility.ForDataProvider.setSheetAddClient;

public class AddClientDPTest {
    WebDriver driver;
    @BeforeClass
    public void loginTest()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        Login login = new Login(driver);

        login.setTxtUsername("amolujagare@gmail.com");
        login.setTxtPassword("admin123");
        login.clickLogin();
    }

    @Test(dataProvider = "getData")
    public void addClientTest(String clientName, String clientSurname, String language,
                              String streetAddress1, String streetAddress2, String city,
                              String state, String zipCode, String country, String gender,
                              String birthdate, String phoneNumber, String faxNumber,
                              String mobileNumber, String emailAddress, String webAddress,
                              String vatId, String taxCode,String expected,String xpathActual) {

        setSheetAddClient("","");



        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName(clientName);
        addClient.setClientSurname(clientSurname);
        addClient.setLanguage(language);
        addClient.setStreetAddress1(streetAddress1);
        addClient.setStreetAddress2(streetAddress2);
        addClient.setCity(city);
        addClient.setState(state);
        addClient.setZipCode(zipCode);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthdate(birthdate);
        addClient.setPhoneNumber(phoneNumber);
        addClient.setFaxNumber(faxNumber);
        addClient.setMobileNumber(mobileNumber);
        addClient.setEmailAddress(emailAddress);
        addClient.setWebAddress(webAddress);
        addClient.setVATID(vatId);
        addClient.setTaxCode(taxCode);

        addClient.clickSave();


        String actual = "";
        try {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no message");



    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return getMyData("Data/add_client_data.xlsx","Sheet1");
    }
}
