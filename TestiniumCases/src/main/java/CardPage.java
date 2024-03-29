import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPage extends BasePage{
    By productNameLocator = By.cssSelector("a-size-base-plus a-color-base sc-product-title sc-grid-item-product-title");
    public CardPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0;
    }
    private List<WebElement> getProducts()
    {
        return findAll(productNameLocator);
    }
}
