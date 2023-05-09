package org.example;
import org.openqa.selenium.*;
public class addEstimateButton {
    WebDriver driver;
    public addEstimateButton(WebDriver driver){
        this.driver=driver;
    }
    private By addToEstimateButton = By.xpath("//form[@name='ComputeEngineForm']//button[contains(text(),'Add to Estimate')]");
    private By informationInVmClassIsRegular = By.xpath("//md-select[@aria-label='VM Class: Regular']");
    private By InformationInInstanceTypeIncludeN1Standard8 = By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");
    private By localSsdSpace2x375Gib = By.xpath("//div[@class='md-text'][text()='24x375 GB']");
    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");


    public void pushAddToEstimate() throws InterruptedException
    {
        driver.findElement(addToEstimateButton).click();
        Thread.sleep(3000);
    }

}
