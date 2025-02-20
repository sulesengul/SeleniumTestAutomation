package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends BaseTest {

    @Step("Kullanıcı bilgisi alınır")
    public String getAccount() {
        screenshot();
        return driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        }

    @Step("Arama alanına veri girşi sağlanır")
    public MainPage fillSearch(String text){
        driver.findElement(By.cssSelector("[data-testid=\"suggestion\"]")).sendKeys(text, Keys.ENTER);
        return this;
    }
}
