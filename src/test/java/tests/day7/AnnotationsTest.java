package tests.day7;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsTest {

    //runs only once before beforeMethod, and before all tests
    @BeforeClass
    public void beforeClass(){

        System.out.println("before Class!");

    }
    @AfterClass
    public void afterClass(){

        System.out.println("After class!");
    }

   @BeforeMethod
    public void setup(){  // some code that will be running before every test we can use @BeforeMethod

       System.out.println("Before method!");

    }
    @AfterMethod
    public void teardown(){

        System.out.println("After Method!");
    }

   @Test
    public void test1(){

        System.out.println("Test 1!");
        Assert.assertTrue((5==5));
    }

    @Test
    public void test2() {

        System.out.println("Test 2!");


    }

    @Test
    public void test3() {

        System.out.println("Test 3!");
    }
}
