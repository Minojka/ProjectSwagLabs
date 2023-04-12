import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage extends BasePage {

    @FindBy(className = "product_sort_container")
    WebElement sortDropDown;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement sauceLabsOnesie;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement bikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement boltTShirt;

    @FindBy(css = "#shopping_cart_container span")
    WebElement cart;

    public InventoryPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void SortItemByValue(){
        Select drop = new Select(sortDropDown);
        drop.selectByValue("lohi");
    }
    public String Cart(){
        return cart.getText();
    }
    public void AddOnesie(){
        sauceLabsOnesie.click();
    }
    public void AddBikeLight(){
        bikeLight.click();
    }
    public void AddTShirt(){
        boltTShirt.click();
    }
}



