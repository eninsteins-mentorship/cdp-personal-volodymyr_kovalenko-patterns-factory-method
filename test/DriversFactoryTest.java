import com.kovalenkovolodymyr.factorymethod.DriverOption;
import com.kovalenkovolodymyr.factorymethod.DriverOptionConfigReader;
import com.kovalenkovolodymyr.factorymethod.DriversFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DriversFactoryTest {
    WebDriver driver;

    @Test
    public void test() {
        DriverOption driverOption = DriverOptionConfigReader.readDriverConfig();
        driver = DriversFactory.getDriver(driverOption);
        Assert.assertEquals(driver.getClass(), InternetExplorerDriver.class);
    }

    @AfterMethod
    public void after() {
        driver.close();
    }
}
