package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class PasteBinTest {
    WebDriver driver;
    @Test
    public void PasteBinVerification() throws InterruptedException {
        driver = FactoryBrowser.setupBrowser("chrome","https://pastebin.com/");
        PasteBinAPP page= PageFactory.initElements(driver , PasteBinAPP.class);
        page.NewPaste();
        Thread.sleep(2000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);
        page.pasteExpiration();
        Thread.sleep(2000);
        page.expireTime();
        Thread.sleep(2000);
        page.pasteName();
        Thread.sleep(2000);
        page.Submit();
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);

    }
}
