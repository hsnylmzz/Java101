import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;

public class Test_Add_Product_To_Card extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;

    CardPage cardPage;
    @Test
    @Order(1)
    public void search_a_product()
    {
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Ceket");
        Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page");
    }
    @Test
    @Order(2)
    public void select_a_product()
    {
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page");
    }
    @Test
    @Order(3)
    public void add_product_to_card()
    {
        productDetailPage.addToCard();
        Assertions.assertTrue(homePage.isProductCountUp(),"Product count isn't decreased");
    }
    @Test
    @Order(4)
    public void go_to_card()
    {
        cardPage = new CardPage(driver);
        homePage.goToCard();
        Assertions.assertTrue(cardPage.checkIfProductAdded(),"Product wasn't added to Card");
    }


}
