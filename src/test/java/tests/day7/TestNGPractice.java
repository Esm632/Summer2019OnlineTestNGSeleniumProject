package tests.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class TestNGPractice {

    @Test
    public void test() { // IT SHOULD ALWAYS VOID
        // to verify that expected and actual result is the same
        // if no it will throw exception and stop the program
        //also, you will see in the console what was expected and what was actual

        Assert.assertEquals("apple", "apple");

      /* if(str.equals(str2)){
            System.out.println("passed");
        }else{                                            // instead of if statement we use assertEquals in TestNG
            System.out.println("failed");
        }
       */

    }
@Test
    public void verifyTitle(){

        WebDriver driver = BrowserFactory.getDriver(("chrome"));
        driver.get("http://practice.cybertekschool.com/");
        String expectedTitle  = "Practice";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle,"Title is wrong");
        driver.quit();

    }

    //verify that Test Automation Practice heading is displayed
    @Test(description = "Verify that heading is displayed")
    public void verifyHeadingDisplayed(){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        WebElement heading = driver.findElement(By.xpath("//span[text()='Test Automation Practice']"));
        //to make sure that element is visible to user
        //because element can be present, but not visible
        //we need to make sure element is visible
        //Element is not visible -- will be printed it element is there, but not visible
        //assertTrue - method that checks if something is true
        //if its false you will get exception
        //.isDisplayed() returns true or false

        Assert.assertTrue(heading.isDisplayed(), "element is not visible");
        driver.quit();

    }
}
