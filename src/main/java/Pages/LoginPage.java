package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("E posta alanına veri girişi sağlanır")
    public LoginPage fillEmail (String email) {
        driver.findElement(By.id("login-email")).sendKeys(email);
        return this;
    }

    @Step("Parola alanına veri girişi sağlanır")
    public LoginPage fillPassword (String password) {
        driver.findElement(By.name("login-password")).sendKeys(password);
        return this;
    }

    @Step("Giriş yap butonuna tıklanır")
    public LoginPage clickLoginButton () {
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        return this;
    }

    @Step("Hata mesajı ekrandan çekilir")
    public String getErrorMessage () {
        return driver.findElement(By.cssSelector("[class='message']")).getText();
    }
}
