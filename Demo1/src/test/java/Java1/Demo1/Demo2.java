package Java1.Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo2 {
	@Test(priority = 2)
    void setup()
    {
        System.out.println("This is opening browser");
    }
    @Test(priority = 3)
    void SearchCustomer()
    {
        System.out.println("This is test Search customer");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 6)
    void addCustomerTest()
    {
        System.out.println("This is test add customer");
    }
    @Test(priority = 4)
    void tearDown()
    {
        System.out.println("closing browser");
    }
}


