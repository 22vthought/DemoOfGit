package com.Practise;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends SuiteBase{

public static WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(5));
public Actions actions= new Actions(driver);


}
