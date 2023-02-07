package com.Practise.First;

import com.Practise.PageFunctions;
import com.Practise.SuiteBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.testng.annotations.Test;

import java.util.Optional;

public class Test2 extends SuiteBase {

    @Test
    public void DemoTestCDP() throws InterruptedException {

        loadWebBrowserChromedevTools();
        DevTools dt= driverCDP.getDevTools();
        dt.createSession();

        dt.send(Emulation.setDeviceMetricsOverride(375,667,50,true, Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));
Thread.sleep(2000);


        PageFunctions obj_PF= new PageFunctions(driver);

        obj_PF.openWebsite();

        obj_PF.searchItemMobileView();
        closeBrowser();
    }
}
