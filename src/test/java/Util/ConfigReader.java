package Util;

import java.util.ResourceBundle;

public class ConfigReader {

 //   ResourceBundle rb = ResourceBundle.getBundle("Config");

    public static String getUrl()
    {
       return ResourceBundle.getBundle("config").getString("url");
    }

    public static String getUsername()
    {
        return ResourceBundle.getBundle("config").getString("username");
    }

    public static String getPassword()
    {
        return ResourceBundle.getBundle("config").getString("password");
    }

    public static String getSheetPath()
    {
        return ResourceBundle.getBundle("config").getString("sheetPath");
    }

}
