package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    String xpathSearchFacebook = "//input[@placeholder='Search Facebook']";
    String xpathSearchResults = "//ul[contains(@aria-label,'suggested searches')]";
    String xpathAccount = "//div[@aria-label='Account']";

    public void searchFacebook(){
        driver.findElement(By.xpath(xpathSearchFacebook)).sendKeys("Cucumber");
        Assert.assertTrue(driver.findElements(By.xpath(xpathSearchResults)).size()>0);
    }

    public void clickOnAccount(){
        driver.findElement(By.xpath(xpathAccount)).click();
    }
}
