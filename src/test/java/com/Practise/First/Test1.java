package com.Practise.First;

import com.Practise.PageFunctions;
import com.Practise.SuiteBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 extends SuiteBase {

    @Test
    public void DemoTest1() throws InterruptedException {

        loadWebBrowser();
        PageFunctions obj_PF= new PageFunctions(driver);

        obj_PF.openWebsite();

        obj_PF.searchItem();
        closeBrowser();
    }
}
