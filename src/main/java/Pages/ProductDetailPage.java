package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ProductDetailPage extends BaseTest {

    @Step("Favoriye ekle butonuna tıklanır")
    public ProductDetailPage favoriteButtonClick() {

        By favoriteButton = By.cssSelector("[class='i-heart-orange']");
        if (!isElementDisplay(favoriteButton))
            driver.findElement(By.cssSelector("[class='product-container'] [class='i-heart']")).click();
        screenshot();
        return this;
    }

    @Step("Anladım butonuna tıklanır")
    public ProductDetailPage approveButtonClick() {
        driver.findElement(By.cssSelector("[class=\"onboarding-popover__default-renderer-primary-button\"]")).click();
        return this;
    }
}
