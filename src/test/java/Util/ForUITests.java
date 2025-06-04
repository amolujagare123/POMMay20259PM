package Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class ForUITests {

    public static boolean checkAvailability(WebElement element)
    {
        boolean result = false;
        try {
            result = element.isDisplayed();
        }
        catch (Exception e)
        {

        }

        return result;
    }


    public static boolean checkEnability(WebElement element)
    {
        boolean result = false;
        try {
            result = element.isEnabled();
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static boolean checkSelection(WebElement element)
    {
        boolean result = false;
        try {
            result = element.isSelected();
        }
        catch (Exception e)
        {

        }

        return result;
    }


    public static String checkText(WebElement element)
    {
        String result = "";
        try {
            result = element.getText();
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static String checkWatermark(WebElement element)
    {
        String result = "";
        try {
            result = element.getAttribute("placeholder");
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static String checkStyle(WebElement element,String css)
    {
        String result = "";
        try {
            if(css.contains("color"))
                result =  Color.fromString(element.getCssValue(css)).asHex().toUpperCase();
            else
                result = element.getCssValue(css);
        }
        catch (Exception e)
        {

        }

        return result;
    }


}
