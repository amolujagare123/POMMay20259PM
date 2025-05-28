package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String getGender(String genderId)
    {
        String gender = "";

        switch (genderId)
        {
            case "0" : gender="Male";break;
            case "1" : gender="Female";break;
            case "2" : gender="Other";break;
        }

        return gender;
    }

    public static String getCountry(String countryShort) {
        String country = "";

        switch (countryShort) {
            case "IN": country = "India"; break;
            case "US": country = "United States"; break;
            case "UK": country = "United Kingdom"; break;
            case "CA": country = "Canada"; break;
            case "AU": country = "Australia"; break;
            case "DE": country = "Germany"; break;
            case "FR": country = "France"; break;
            case "IT": country = "Italy"; break;
            case "ES": country = "Spain"; break;
            case "BR": country = "Brazil"; break;
            case "NG": country = "Nigeria"; break;
            case "JP": country = "Japan"; break;
            case "CN": country = "China"; break;
            case "ZA": country = "South Africa"; break;
            case "RU": country = "Russia"; break;
            default: country = "Unknown";
        }

        return country;
    }

    // Db date - 2025-05-22 --> yyyy-MM-dd
    // expected --> 22-May-2025 --> dd-MMM-yyyy

    public static String convertDate(String dbDate) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDate);

        return  new SimpleDateFormat("dd-MMM-yyyy").format(date);
    }

}
