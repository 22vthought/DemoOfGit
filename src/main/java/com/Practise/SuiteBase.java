package com.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.remote.CapabilityType;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SuiteBase {

    public static Logger Add_Log =  null;
    public static Properties Param= null;

    public static WebDriver driver = null;
    public static ChromeDriver driverCDP = null;
    public static WebDriver ExistingChromedriver;


    public void init() throws IOException{
        //to initiate loggger services
//        Add_Log= new Logger();
        Param=new Properties();
        FileInputStream fip= new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//Practise//property//Param.properties");
        Param.load(fip);
        Add_Log.info("Param.properties file loaded successfully");
    }

    public void loadWebBrowser(){
//        if (Param.getProperty("testBrowser").equalsIgnoreCase("chrome") )
//        {
            //load chrome driver instance
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//browserDrivers//chromedriver.exe");
            ChromeOptions options= new ChromeOptions();
            options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

            driver =new ChromeDriver();
            ExistingChromedriver= driver;

//        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public void loadWebBrowserChromedevTools(){
//        if (Param.getProperty("testBrowser").equalsIgnoreCase("chrome") )
//        {
        //load chrome driver instance
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//browserDrivers//chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

        driverCDP =new ChromeDriver();
        ExistingChromedriver= driverCDP;

//        }

        driverCDP.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driverCDP.manage().window().maximize();

    }


    public void  closeBrowser(){
        driver.quit();
        ExistingChromedriver=null;
    }
}
