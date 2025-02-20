package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;

public class ProductDetailPage extends BaseTest {

    public ProductDetailPage favoriteButtonClick() {

        By favoriteButton = By.cssSelector("[class='i-heart-orange']");
        if (!isElementDisplay(favoriteButton))
            driver.findElement(By.cssSelector("[class='product-container'] [class='i-heart']")).click();
        return this;
    }

    public ProductDetailPage approveButtonClick() {
        driver.findElement(By.cssSelector("[class=\"onboarding-popover__default-renderer-primary-button\"]")).click();
        return this;
    }
}
