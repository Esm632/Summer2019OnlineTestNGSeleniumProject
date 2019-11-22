package VytrackLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class LoginAutomate {
    public static void main(String[] args) {
        // starting from driver setup
        WebDriver driver = BrowserFactory.getDriver("chrome");
        // go to url
        driver.get("http://qa2.vytrack.com/user/login");
        //to find the element(username) by name
        WebElement inputUser = driver.findElement(By.name("_username"));
        //to enter the credential for username
        inputUser.sendKeys("storemanager95");
        //to find the element(password)by name
        WebElement inputPassword = driver.findElement(By.name("_password"));
        // to enter the credential for password
        inputPassword.sendKeys("UserUser123");
        // to find the element(login button)
        WebElement LoginButton = driver.findElement(By.name("_submit"));
        //to click on log in button
        LoginButton.click();
        // to hold 3 sec
        BrowserUtils.wait(3);
        String expectedUrl = "https://qa2.vytrack.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        driver.close();

    }
}
