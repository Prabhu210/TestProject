package Java1.Demo1;

import org.testng.annotations.Test;

public class Demo {
	@Test(priority = 1)
    void setup()
    {
    System.out.println("This is opening browser");
    }
    @Test(priority = 6)
    void login()
    {
        System.out.println("This is login test");
    }
    @Test(priority = 5)
    void tearDown()
    {
        System.out.println("closing browser");
    }
}


