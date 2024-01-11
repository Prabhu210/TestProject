package Java1.Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1 {
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
    void test1()
    {
        System.out.println("This is test1");
    }
    @Test
    void test2()
    {
        System.out.println("This is test2");
    }
    @BeforeTest
    void Beforetest()
    {
    System.out.println("This will be excecuted before the Test");
    }
    @AfterTest
    void Aftertest()
    {
        System.out.println("This will be excecuted after the Test");
    }

}
