package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    By pop = By.xpath("//*[@id=\"pop\"]/div/section/button");
    By account = By.xpath("//label[normalize-space()='Account']");
    By signin = By.xpath("//a[normalize-space()='Sign In']");

    public void closepop(){
        driver.findElement(pop).click();
    }

    public void clickonaccount(){
        driver.findElement(account).click();
    }
    public void clickonsignin(){
        driver.findElement(signin).click();
    }

}
