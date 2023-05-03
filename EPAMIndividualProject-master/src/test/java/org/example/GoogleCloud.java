package org.example;

import com.Browser.BrowserParameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class GoogleCloud {
    @Test
    public void GoogleCloud() throws InterruptedException {
        WebDriver driver= BrowserParameter.setupBrowser("chrome","https://cloud.google.com/");

        GoogleCloudObject calculatorPage=new GoogleCloudObject(driver);
        Home H = new Home(driver);
        fillCloudForm F = new fillCloudForm(driver);
        H.homePage();
        F.sendKeyInToNumberOfInstancesField("4");
        F.selectSeriesOfMachine();
        F.selectMachineType();
        F.clickAddGpusCheckBox();
        F.selectGpuType();
        F.selectNumberOfGpus();
        F.selectLocalSsd();
        F.selectDataCenterLocation();
        F.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
    }
}
