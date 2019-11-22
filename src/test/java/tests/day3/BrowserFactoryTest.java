package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class BrowserFactoryTest {
    public static void main (String[]args){


        //we gonna create a method
        //that will return a webdriver object
        //this method will take one parameter

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
      // how we can print a source code of the page?
        System.out.println(driver.getPageSource());
        // to finish test execution
        driver.quit();

    }
}
