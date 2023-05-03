package org.example;

import com.Browser.BrowserParameter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PasteBin {
    @Test
    public void PasteBin() throws InterruptedException {
        WebDriver driver= BrowserParameter.setupBrowser("chrome","https://pastebin.com/");

        PasteBinObject pasteBin=new PasteBinObject(driver);

        pasteBin.writeTextInToNewPasteField("Hello from WebDriver");
        pasteBin.scroll();
        pasteBin.selectPasteExpiration();
        pasteBin.writeTextInToTitleField("helloWeb");
        pasteBin.pressCreateNewPasteButton();
    }
}
