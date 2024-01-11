package Java1.Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tc2 {
	@BeforeClass
    void beforeclass()
    {
        System.out.println("This will be executed before class ");
    }
    @AfterClass
    void afterclass()
    {
        System.out.println("This will be executed after class ");
    }
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will be executed before every method ");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will be executed After every method ");
    }
    @Test
    void test3()
    {
        System.out.println("This is test3");
    }
    @Test
    void test4()
    {

        System.out.println("This is test4");
    }
    @BeforeSuite
    void Beforesuite()
    {
        System.out.println("This will be executed before suite ");
    }
    @AfterSuite
    void Aftersuite()
    {
        System.out.println("This will be executed After suite ");
    }
}


