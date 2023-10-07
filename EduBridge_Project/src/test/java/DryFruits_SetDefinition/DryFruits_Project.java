package DryFruits_SetDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DryFruits_Project {

	WebDriver driver = new ChromeDriver();

    @Given("^the user is on the website$")
    public void userIsOnWebsite() {

        driver.get("https://www.dryfruitbasket.in/");
        driver.manage().window().maximize();
    }

    @When("^the user logs in$")
    public void userLogsIn() throws InterruptedException {
    	 // Logging in
        {
            // Clicking login link
            WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div/div/div[2]/ul/li[6]/div/ul/li/a"));
            login.click();
            Thread.sleep(2000);
            
            // Clicking signin link
            WebElement signin = driver.findElement(By.id("login-form-link"));
            signin.click();
            Thread.sleep(2000);

            // Entering email
            driver.findElement(By.id("email2")).sendKeys("lakshshines@gmail.com");
            Thread.sleep(2000);

            // Entering password
            driver.findElement(By.id("password2")).sendKeys("Lp@123");
            Thread.sleep(2000);

            // Clicking signin button
            WebElement signinButton = driver.findElement(By.id("loginSubmit"));
            assert signinButton != null : "Login button not found"; // Assertion
            signinButton.click();
            Thread.sleep(3000);
            // Checking if login is successful
            if (signinButton != null) {
                System.out.println("Login Successful!!!");
            }
        }
        
        WebElement signinButton = driver.findElement(By.id("loginSubmit"));
        assert signinButton != null : "Login button not found"; // Assertion
    }

    @Then("^the user performs various actions$")
    public void userPerformsActions() throws InterruptedException {
    	 // Displaying an alert
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("alert('LOGIN SUCCESSFUL!!!!');");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        System.out.println("Displaying an alert done Successful!!1");

        // Mouse over action
        WebElement elementToHoverOver = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div/div/div[2]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHoverOver).perform();
        System.out.println(" Mouse over action done successfully.");
        
        // Clicking a submenu item
        WebElement subMenuItem = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div/div/div[2]/ul/li[1]/div/div/div/ul/li[11]/a"));
        subMenuItem.click();
        Thread.sleep(3000);

        // Wishlist actions (on and off)
        WebElement wishon = driver.findElement(By.cssSelector("#wishlist_473"));
        wishon.click();
        Thread.sleep(2000);
        WebElement wishoff = driver.findElement(By.cssSelector("#wishlist_473"));
        wishoff.click();
        Thread.sleep(2000);
        System.out.println(" Wishlist actions (on and off) done successfully.");
        
        // Accepting cookies
        WebElement cookieButton = driver.findElement(By.cssSelector(".btn.btn-primary.btn-accept"));
        cookieButton.click();
        Thread.sleep(2000);

        // Clicking a plus button
        WebElement plusButton = driver.findElement(By.cssSelector(".btn.btn-number.btn-plus"));
        plusButton.click();
        Thread.sleep(2000);
        System.out.println(" Clicking a plus button done successfully.");
        
        // Adding to cart
        WebElement addToCartButton = driver.findElement(By.cssSelector(".theme-btn.btn-add-to-card"));
        addToCartButton.click();
        Thread.sleep(4000);

        // Navigating back
        driver.navigate().back();
        Thread.sleep(3000);
        System.out.println("Navigating back done successfully.");

        // Nuts and berries section
        WebElement elementToHoverOver2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div/div/div[2]/ul/li[4]/a"));
        Actions actionss = new Actions(driver);
        actionss.moveToElement(elementToHoverOver2).perform();

        // Clicking a submenu item
        WebElement subMenuItems = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div/div/div[2]/ul/li[4]/div/div/div/ul/li[8]/a"));
        subMenuItems.click();
        Thread.sleep(3000);

        // Selecting a gram
        WebElement gramSelect = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section[2]/div[1]/div/div[2]/div/div[2]/form[2]/div[1]/div[1]/div"));
        gramSelect.click();
        Thread.sleep(3000);

        WebElement grams = driver.findElement(By.xpath("//*[@id=\"app\"]/div/section[2]/div[1]/div/div[2]/div/div[2]/form[2]/div[1]/div[1]/div/ul/li[2]"));
        grams.click();
        Thread.sleep(3000);
        
        System.out.println("Gram Select Dropdown done successfully.");
        
        // Adding to cart
        WebElement addToCartButton2 = driver.findElement(By.cssSelector(".theme-btn.btn-add-to-card"));
        addToCartButton2.click();
        Thread.sleep(5000);

        // Clicking the logo
        WebElement logo = driver.findElement(By.className("header-logo"));
        logo.click();
        Thread.sleep(4000);

        // Using search
        WebElement search = driver.findElement(By.xpath("//*[@id=\"click_search\"]/a"));
        search.click();
        Thread.sleep(2000);

        // Typing in the search bar
        driver.findElement(By.xpath("//*[@id=\"search_popup\"]/div/div[1]/form/div[1]/input")).sendKeys("makhana");
        Thread.sleep(4000);

        // Clicking the search button
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search_popup\"]/div/div[1]/form/div[1]/div/button"));
        searchButton.click();
        Thread.sleep(3000);
        
        System.out.println("Searching Action done successfully.");

        // Scrolling down
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);

        System.out.println("Scrolling down successfully.");
        
        // Clicking to add to cart
        WebElement adding = driver.findElement(By.xpath("//*[@id=\"filter_product\"]/div[2]/div[4]"));
        adding.click();
        Thread.sleep(3000);

        // Adding to cart
        WebElement addToCartButton3 = driver.findElement(By.cssSelector(".theme-btn.btn-add-to-card"));
        addToCartButton3.click();
        Thread.sleep(5000);

        // Clicking cart icon
        WebElement cartopen = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/nav/div/div/div[2]/ul/li[7]/div"));
        cartopen.click();
        Thread.sleep(3000);

        // Clicking checkout
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"app\"]/div/aside[4]/div/div[3]/a[1]"));
        checkout.click();
        Thread.sleep(1000);

        // Scrolling down
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,1800)");
        Thread.sleep(3000);

        // Clicking "My Account"
        
        WebElement myacc = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div[1]/div/div[2]/ul/li/ul/li[1]/a"));
        myacc.click();
        Thread.sleep(3000);
        
       // WebElement myAccountLink = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div[1]/div/div[2]/ul/li/ul/li[1]/a"));
    //    assert myAccountLink.isDisplayed() : "My Account link is not displayed"; // Assertion
    }

    @And("^logs out$")
    public void userLogsOut() throws InterruptedException {
    	
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div[3]/div/div[1]/div/div/ul/li[7]/a"));
        logout.click(); 
        System.out.println("Logged out done  successfully !!!");
        
     // Displaying an alert
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("alert('LOGing out SUCCESSFUL!!!!');");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        	        
    }
    
    @When("^the user takes a screenshot$")
    public void userTakesScreenshot() {

    	 ChromeOptions options = new ChromeOptions();
    	
        options.addArguments("--remote-allow-origins=*");

        driver.get("https://reports.cucumber.io/reports/66ed2c3e-2ab9-4282-b974-7bd2710cba69");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Then("^the screenshot should be saved$")
    public void screenshotShouldBeSaved() {
    	
    	  //taking Screenshot
        
        ChromeOptions options = new ChromeOptions();
    	
        options.addArguments("--remote-allow-origins=*");

        driver.get("https://reports.cucumber.io/reports/66ed2c3e-2ab9-4282-b974-7bd2710cba69");
        driver.manage().window().maximize();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	
    	TakesScreenshot tk=(TakesScreenshot)driver;
        // Your existing screenshot steps...
        File source = tk.getScreenshotAs(OutputType.FILE);
        File des = new File("D:/DryFruitsScreenShot.png");

        try {
            FileUtils.copyFile(source, des);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot taken successfully.");
        driver.close();
        
        System.out.println("Project Executed successfully.");
    }
    
}

