package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.Login;

import static Util.ConfigReader.getPassword;
import static Util.ConfigReader.getUsername;

public class DoLogin extends OpenURL {


    @BeforeClass
    public void doLogin()
    {

        Login login = new Login(driver);

        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();
    }
}
