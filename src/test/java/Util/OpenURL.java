package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import static Util.ConfigReader.getUrl;

public class OpenURL {
    public static WebDriver driver;

    @BeforeClass
    public void openUrl()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());
    }
}
