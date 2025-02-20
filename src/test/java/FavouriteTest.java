import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.ProductDetailPage;
import Pages.ProductListPage;
import org.testng.annotations.Test;

public class FavouriteTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Test
    public void favouriteTest() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLoginButton();

        mainPage.fillSearch("iphone 13 128 gb");
        productListPage.firstProductClick();
        switchTab(1);

        productDetailPage.approveButtonClick()
                .favoriteButtonClick();
    }
}
