package com.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFunctions extends BasePage {

    public PageFunctions(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "twotabsearchtextbox")
    private static WebElement searchBar;

    @FindBy(id = "nav-search-submit-button")
    private static WebElement searchIcon;

    @FindBy(id = "twotabsearchtextbox")
    private static WebElement searchBarMob;

    @FindBy(id = "nav-orders")
    private static WebElement returnNOrders;

    @FindBy(id = "twotabsearchtextbox")
    private static WebElement SearchIconMob;

    public void openWebsite(){
        driver.get("https://www.amazon.com/");
        System.out.println("Browser loaded sucesfully");
    }

    public void openWebsite2(){
        driver.get("https://www.amazon.com/");
        
        System.out.println("Browser loaded sucesfully");
    }

    public void searchItem() throws InterruptedException {
        searchBar.click();
        System.out.println("Search bar clicked");
        Thread.sleep(2000);
        searchBar.sendKeys("gifts");
        System.out.println("search item entered");
        Thread.sleep(2000);
        searchIcon.click();
        System.out.println("search icon clicked");
        Thread.sleep(2000);
    }

    public void searchItemMobileView() throws InterruptedException {
        searchBar.click();
        System.out.println("Search bar clicked");
        Thread.sleep(2000);
        searchBar.sendKeys("gifts");
        System.out.println("search item entered");
        Thread.sleep(2000);
        searchIcon.click();
        System.out.println("search icon clicked");
        Thread.sleep(2000);
    }

}
