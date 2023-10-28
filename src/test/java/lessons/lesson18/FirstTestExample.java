package lessons.lesson18;

import org.testng.annotations.*;

public class FirstTestExample {

    @BeforeTest
    public void beforeTest() {
        System.out.println("This method will execute before first test once");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This method will execute before class once");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This method will execute before each test method");
    }

    @Test(description = "this is our first test", priority = 1, timeOut = 5, invocationCount = 5, invocationTimeOut = 20)
    public void testMethod() {
        System.out.println("Hello world!");
    }

    @Test(alwaysRun = true, priority = 2, enabled = true, dependsOnMethods = "testMethod")
    public void testMethod2() {
        System.out.println("Hello world2!");
    }

    @Test(expectedExceptions = {ArithmeticException.class})
    public void testDivision() {
        System.out.println(2 / 0);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This method will execute after each test method");
    }
}
