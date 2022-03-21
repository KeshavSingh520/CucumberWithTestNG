package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private String inputEmail = "//input[@name='email']";
    private String inputPassword = "//input[@name='pass']";
    private String btnLogin = "//button[@name='login']";

    /**
     * @param username
     * @param password
     */
    public void enterUsernamePassword(String username, String password) {
        driver.findElement(By.xpath(inputEmail)).sendKeys(username);
        driver.findElement(By.xpath(inputPassword)).sendKeys(password);
    }


    public void clickLoginButton() {
        driver.findElement(By.xpath(btnLogin)).click();
    }


    public void checkUserIsOnHomePage(String expectedTitle) {
        System.out.println("HomePage title : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    public void userIsOnLoginPage() {
        System.out.println("Login title : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
    }
}
