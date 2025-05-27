package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;

public class AddClientTest {
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

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);




        addClient.setClientName("Amol2");
        addClient.setClientSurname("Ujagare");
        addClient.setLanguage("Spanish");
        addClient.setStreetAddress1("123 Coaching Street");
        addClient.setStreetAddress2("Suite 456");
        addClient.setCity("Pune");
        addClient.setState("Maharashtra");
        addClient.setZipCode("411001");
        addClient.setCountry("Nigeria");
        addClient.setGender("Female");
        addClient.setBirthdate("22-May-2025");
        addClient.setPhoneNumber("02012345678");
        addClient.setFaxNumber("02087654321");
        addClient.setMobileNumber("9876543210");
        addClient.setEmailAddress("amol@example.com");
        addClient.setWebAddress("https://amolujagare.in");
        addClient.setVATID("VAT1234567");
        addClient.setTaxCode("TAX123456");

        addClient.clickSave();
    }
}
