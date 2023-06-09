package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PasteBinAPP {
    WebDriver driver;
    By code = By.id("postform-text");
    By pasteExpire = By.id("select2-postform-expiration-container");
    By expire = By.xpath("//span[@class= 'select2-results']/ul/li[3]");
    By title = By.id("postform-name");
    By button = By.xpath("//button[text() = 'Create New Paste']");
    public PasteBinAPP(WebDriver driver) {this.driver = driver;}
    public void NewPaste()
    {
        driver.findElement(code).sendKeys("Hello from WebDriver");
    }
    public void pasteExpiration()
    {
        driver.findElement(pasteExpire).click();
    }
    public void expireTime()
    {
        driver.findElement(expire).click();
    }
    public void pasteName()
    {
        driver.findElement(title).sendKeys("helloweb");
    }
    public void Submit()
    {
        driver.findElement(button).click();
    }
}

