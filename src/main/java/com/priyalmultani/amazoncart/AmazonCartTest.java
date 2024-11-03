package com.priyalmultani.amazoncart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.priyalmultani.base.BaseTest;

public class AmazonCartTest extends BaseTest{

	@Test
    public void testAddToCart() throws InterruptedException {
		/*
		    // Step 1: Open the URL
		    //driver.get("https://www.amazon.in/");

		    // Step 2: Search for iPhone 16
		    WebElement searchBox = driver.findElement(By.id(sitedata.getProperty("searchBox_id")));
		    searchBox.sendKeys("iPhone 16");
		    searchBox.submit();
		    
		    // Step 3: Scroll down the page
		    WebElement Page2Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='s-pagination-item s-pagination-button'][1]")));
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", Page2Button);
		    
		    
		    // Click on page 2
		    Page2Button.click();
		    
		    
		    // Step 4: Select the 5th product
		    WebElement fifthProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='search']//div[@data-component-type='s-search-result'][5]//h2/a")));
		    js.executeScript("arguments[0].scrollIntoView(true);", fifthProduct);
		    String productTitle = fifthProduct.getText().trim();
		    
		    
		    // Step 5: Click on the title to open it
		    fifthProduct.click();

		    
		    //Switching to new opened tab
		    List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
		    driver.switchTo().window(windowHandles.get(1));
		    		    
		    // Step 6: Verify title
		    String actualTitle = driver.findElement(By.xpath("//span[@id='productTitle']")).getText().trim();
		    Assert.assertEquals(actualTitle, productTitle, "Titles do not match");
		    
		    // Step 7: Click on Add to Cart button
		    WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='add-to-cart-button'])[2]")));
		    js.executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
		    addToCartButton.click();
		    Thread.sleep(30);
		    
		    // Step 8: Click on Cart button and verify product is in cart
		    WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span/input")));
		    cartButton.click();
		    Thread.sleep(30);
		    
		    // Verify that the product is in the cart
		    WebElement cartProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-truncate-cut']")));
		    String cartProductTitle = cartProduct.getText();
		    Assert.assertEquals(cartProductTitle, productTitle, "Product is not present in the cart");
		    Thread.sleep(30);
		 
	}
	*/
		
	/*
	// Step 1: Open the URL
    //driver.get("https://www.amazon.in/");

    // Step 2: Search for iPhone 16
    WebElement searchBox = driver.findElement(By.id(sitedata.getProperty("searchBox_id")));
    searchBox.sendKeys("iPhone 16");
    searchBox.submit();
    
    // Step 3: Scroll down the page
    WebElement Page2Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sitedata.getProperty("page2Button_xpath"))));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", Page2Button);
    
    
    // Click on page 2
    Page2Button.click();
    
    
    // Step 4: Select the 5th product
    WebElement fifthProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sitedata.getProperty("fifthProductLink_xpath"))));
    js.executeScript("arguments[0].scrollIntoView(true);", fifthProduct);
    String productTitle = fifthProduct.getText().trim();
    
    
    // Step 5: Click on the title to open it
    fifthProduct.click();

    
    //Switching to new opened tab
    List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(windowHandles.get(1));
    		    
    // Step 6: Verify title
    String actualTitle = driver.findElement(By.xpath(sitedata.getProperty("productTitle_xpath"))).getText().trim();
    Assert.assertEquals(actualTitle, productTitle, "Titles do not match");
    
    // Step 7: Click on Add to Cart button
    WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sitedata.getProperty("addToCartButton_xpath"))));
    js.executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
    addToCartButton.click();
    Thread.sleep(30);
    
    // Step 8: Click on Cart button and verify product is in cart
    WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sitedata.getProperty("cartButton_xpath"))));
    cartButton.click();
    Thread.sleep(30);
    
    // Verify that the product is in the cart
    WebElement cartProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sitedata.getProperty("cartProduct_xpath"))));
    String cartProductTitle = cartProduct.getText();
    Assert.assertEquals(cartProductTitle, productTitle, "Product is not present in the cart");
    Thread.sleep(30);
 */
		// Step 1: Open the URL
	    //driver.get("https://www.amazon.in/");

	    // Step 2: Search for iPhone 16
	    WebElement searchBox = isElementPresent("searchBox_id");
	    
	    searchBox.sendKeys("iPhone 16");
	    searchBox.submit();
	    
	    // Step 3: Scroll down the page
	    WebElement Page2Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sitedata.getProperty("page2Button_xpath"))));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", Page2Button);
	    
	    
	    // Click on page 2
	    Page2Button.click();
	    
	    
	    // Step 4: Select the 5th product
	    WebElement fifthProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sitedata.getProperty("fifthProductLink_xpath"))));
	    js.executeScript("arguments[0].scrollIntoView(true);", fifthProduct);
	    String productTitle = fifthProduct.getText().trim();
	    
	    
	    // Step 5: Click on the title to open it
	    fifthProduct.click();

	    
	    //Switching to new opened tab
	    List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(windowHandles.get(1));
	    		    
	    // Step 6: Verify title
	    String actualTitle = isElementPresent("productTitle_xpath").getText().trim();
	    
	    Assert.assertEquals(actualTitle, productTitle, "Titles do not match");
	    
	    // Step 7: Click on Add to Cart button
	    WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sitedata.getProperty("addToCartButton_xpath"))));
	    js.executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
	    addToCartButton.click();
	    Thread.sleep(30);
	    
	    // Step 8: Click on Cart button and verify product is in cart
	    WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sitedata.getProperty("cartButton_xpath"))));
	    cartButton.click();
	    Thread.sleep(30);
	    
	    // Verify that the product is in the cart
	    WebElement cartProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sitedata.getProperty("cartProduct_xpath"))));
	    String cartProductTitle = cartProduct.getText();
	    Assert.assertEquals(cartProductTitle, productTitle, "Product is not present in the cart");
	    Thread.sleep(30);
}

}

//1. Properties file