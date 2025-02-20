package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductListPage extends BaseTest {

    @Step("Ürün listesindeki ilk ürüne tıklanır")
    public ProductListPage firstProductClick(){

        driver.findElements(By.cssSelector("[class='p-card-wrppr with-campaign-view']")).get(0).click();
        return this;
    }
}
