package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
public class GoogleCloudTest {
    @Test
    public void GoogleCloud() throws InterruptedException {
        WebDriver driver= FactoryBrowser.setupBrowser("chrome","https://cloud.google.com/");
        addEstimateButton calculatorPage=new addEstimateButton(driver);
        FillForm form = new FillForm(driver);
        Home home =new Home(driver);
        home.homePage();
        form.sendKeyInToNumberOfInstancesField("4");
        form.selectSeriesOfMachine();
        form.selectMachineType();
        form.clickAddGpusCheckBox();
        form.selectGpuType();
        form.selectNumberOfGpus();
        form.selectLocalSsd();
        form.selectDataCenterLocation();
        form.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
        driver.quit();
        Thread.sleep(2000);
    }
}
