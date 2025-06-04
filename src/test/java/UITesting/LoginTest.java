package UITesting;

import Util.OpenURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;

import static Util.ForUITests.*;

public class LoginTest extends OpenURL {
    Login login;

    @BeforeClass
    public void initLogin()
    {
         login = new Login(driver);
    }

  /*  @Test
    public void txtUsernameAvailability()
    {
       boolean expected = true;
       boolean actual = true;
       try {
           actual = login.txtUsername.isDisplayed();
       }
       catch (Exception e)
       {
            actual = false;
       }
       Assert.assertEquals(actual,expected,"element is not present");
    }*/


    @Test
    public void txtUsernameAvailability()
    {
        boolean expected = true;
        boolean actual = checkAvailability(login.txtUsername);
        Assert.assertEquals(actual,expected,"element is not present");
    }

    @Test
    public void txtPasswordAvailability()
    {
        boolean expected = true;
        boolean actual = checkAvailability(login.txtPassword);
        Assert.assertEquals(actual,expected,"element is not present");
    }

    @Test
    public void btnLoginAvailability()
    {
        boolean expected = true;
        boolean actual = checkAvailability(login.btnLogin);
        Assert.assertEquals(actual,expected,"element is not present");
    }


    @Test
    public void txtUsernameEnability()
    {
        boolean expected = true;
        boolean actual = checkEnability(login.txtUsername);
        Assert.assertEquals(actual,expected,"element is not enabled");
    }

    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual = checkText(login.lblEmail);
        Assert.assertEquals(actual,expected,"Wrong spelling");
    }

    @Test
    public void lblPasswordSpellCheck()
    {
        String expected = "Password";
        String actual = checkText(login.lblPassword);
        Assert.assertEquals(actual,expected,"Wrong spelling");
    }

    @Test
    public void passwordWatermarkCheck()
    {
        String expected = "Password";
        String actual = checkWatermark(login.txtPassword);
        Assert.assertEquals(actual,expected,"Wrong watermark");
    }

    @Test
    public void emailWatermarkCheck()
    {
        String expected = "Email";
        String actual = checkWatermark(login.txtUsername);
        Assert.assertEquals(actual,expected,"Wrong watermark");
    }


    @Test
    public void lblEmailFontSizeCheck()
    {
        String expected = "14px";
        String actual = checkStyle(login.lblEmail,"font-size");
        Assert.assertEquals(actual,expected,"Wrong Font Size");
    }

    @Test
    public void lblEmailFontFamilyCheck()
    {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = checkStyle(login.lblEmail,"font-family");
        Assert.assertEquals(actual,expected,"Wrong Font");
    }

    @Test
    public void btnColorCheck()
    {
        String expected = "#2C8EDD";
        String actual = checkStyle(login.btnLogin,"background-color");
        Assert.assertEquals(actual,expected,"Wrong color");
    }

    @Test
    public void btnBorderColorCheck()
    {
        String expected = "#2181ce".toUpperCase();
        String actual = checkStyle(login.btnLogin,"border-color");
        Assert.assertEquals(actual,expected,"Wrong color");
    }

    @Test
    public void btnLoginHoverColorCheck()
    {
        String expected = "#1e73b8".toUpperCase();

        Actions actions = new Actions(driver);
        actions.moveToElement(login.btnLogin).perform();

        String actual = checkStyle(login.btnLogin,"background-color");
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected,"Wrong color");
    }
}
