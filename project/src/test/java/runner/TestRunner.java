package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class TestRunner extends Base {

    WebDriverHelper helper = null;
    ExtentTest test = null;
    ExtentReports report = null;

    @BeforeClass
    public void createRepo(){

        report = Reporter.generateExtentReport("Drugs.com");
    }

    @BeforeMethod

    public void setup() {
        openBrowser();
    }

    @Test (enabled = true, priority = 1)
    public void caseOne() throws InterruptedException {
        System.out.println("fhaf");
        test = report.createTest("Testcase1");
        helper = new WebDriverHelper(driver);
        helper.clickOnElement(By.xpath("//img[@alt='Drugs.com']"));
        Thread.sleep(2000);
        helper.clickOnElement(By.xpath("//a[normalize-space()='Register']"));
        helper.sendKeys(By.xpath("//input[@id='user-email-preconsent']"), "demotest1234@gmail.com");
        
        helper.clickOnElement(By.xpath("//button[normalize-space()='Continue with email']"));
        helper.clickOnElement(By.xpath("//button[normalize-space()='Accept & continue']"));
      
        helper.sendKeys(By.xpath("//input[@id='user-username']"), "demotestuser");
        helper.sendKeys(By.xpath("//input[@id='user-password']"), "manoj20@");
        Thread.sleep(2000);
        helper.clickOnElement(By.xpath("//span[contains(text(),'I accept Drugs.com')]"));
        helper.clickOnElement(By.xpath("//button[normalize-space()='Create your account']"));
        Screenshot.captureScreenShot("dhadahhd");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
    }


    @Test(enabled = true, priority = 2)
    public void caseTwo() throws InterruptedException {
        test = report.createTest("Testcase2");
        helper = new WebDriverHelper(driver);
        helper.sendKeys(By.xpath("//input[@id='livesearch-main']"), "minoxidil");
        helper.enterAction(By.xpath("//input[@id='livesearch-main']"));
        helper.clickOnElement(By.xpath("(//b[contains(text(),'Minoxidil')])[1]"));
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        LoggerHandler.info("Hello");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        test.log(Status.INFO, "Check");
        driver.navigate().to("https://www.drugs.com/");
        helper.sendKeys(By.xpath("//input[@id='livesearch-main']"), "azithromycin");
        
        helper.enterAction(By.xpath("//input[@id='livesearch-main']"));
        helper.clickOnElement(By.xpath("(//b[contains(text(),'Azithromycin')])[1]"));
       

    }

    @Test(enabled = true, priority = 3)
    public void caseThree() throws InterruptedException{
        test = report.createTest("Testcase3");
        helper = new WebDriverHelper(driver);
        helper.clickOnElement(By.xpath("//li[2]//a[1]//b[1]"));
        helper.clickOnElement(By.xpath("//a[normalize-space()='Agree and Continue']"));
        helper.sendKeys(By.xpath("//input[@id='livesearch-imprint']"), "MSD697 DOLOBID");
        LoggerHandler.info("Entered MSD697 DOLOBID");
        Select select = new Select(driver.findElement(By.id("color-select")));
        select.selectByValue("7");
        Thread.sleep(2000);
        Select select2 = new Select(driver.findElement(By.id("shape-select")));
        select2.selectByValue("11");
        helper.clickOnElement(By.xpath("//button[contains(text(),'Search')]"));
       
        test.log(Status.INFO, "Verified DOLOBID MSD697");
        Reporter.attachScreenshotToReport("MSD697 DOLOBID Orange and Oval", test, "Check");

    }

    @Test(enabled = true, priority = 4)
    public void caseFour(){

        helper = new WebDriverHelper(driver);
        helper.clickOnElement(By.xpath("//a[normalize-space()='About Drugs.com']"));
        helper.clickOnElement(By.xpath("//span[normalize-space()='Monthly newsletter']"));
        helper.clickOnElement(By.xpath("//span[normalize-space()='I accept the Terms and Privacy Policy']"));
        helper.clickOnElement(By.xpath("//button[normalize-space()='Subscribe']"));
       System.out.println("We won Mara");
    }


    @AfterMethod
    public void quitBrow() {
       driver.quit();

    }

    @AfterClass
    public void flushrep(){
        report.flush();
    }

}
