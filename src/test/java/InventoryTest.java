import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest{
    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @BeforeMethod
    public void SetUp(){
        driver = openWebDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void Add3ItemsInCart(){
        loginPage.LoginWithValidData();
        inventoryPage.SortItemByValue();
        inventoryPage.AddOnesie();
        inventoryPage.AddBikeLight();
        inventoryPage.AddTShirt();
        Assert.assertEquals(inventoryPage.Cart(),"3");
    }
    @AfterMethod
    public  void After(){
        driver.quit();
    }
}
