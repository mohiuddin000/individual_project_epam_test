package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

    WebDriver driver;
    public Home(WebDriver driver){
        this.driver=driver;
    }

    private By search=By.xpath("//input[@placeholder='Search']");
    private By searchResult=By.xpath("//div[@class='gs-title']//b[contains(text(),'Google Cloud Pricing Calculator')]");

    public void homePage() throws InterruptedException {
        WebElement r = driver.findElement(search);
        r.sendKeys("Google Cloud Platform Pricing Calculator");
        // press ENTER
        r.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        driver.findElement(searchResult).click();
        Thread.sleep(10000);
    }

}
