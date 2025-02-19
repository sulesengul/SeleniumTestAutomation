import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/giris");
        driver.manage().window().fullscreen();
    }


    @Test
    public void loginSuccessful() throws InterruptedException {

        driver.findElement(By.id("login-email")).sendKeys("atalayedamerve@gmail.com");
        driver.findElement(By.name("login-password")).sendKeys("Testeda123.");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(5000);
        String text=driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Hesabım");
    
    }

    @Test
    public void loginUnsuccessful() throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys("atalayedamerve@gmail.com");
        driver.findElement(By.name("login-password")).sendKeys("Testeda123");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector("[class='message']")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='message']")).getText(), "E-posta adresiniz ve/veya şifreniz hatalı.");

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
