package Base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class BaseLibrary extends Data {

    public static WebDriver driver;
    public void sleep (int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchTab (int index) {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
    }

    public boolean isElementDisplay(By elements) {
        try{
            return driver.findElement(elements).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
