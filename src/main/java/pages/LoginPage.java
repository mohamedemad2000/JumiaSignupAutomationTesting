package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    By username = By.xpath("//input[@id='input_identifierValue']");
    By contbutton=By.xpath("//button[@type='submit']");
    By password = By.xpath("//input[@name='password']");
    By confirm = By.xpath("//input[@class='mdc-text-field__input confirm-password-input']");
    By contbutton2=By.xpath("//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded']//span[@class='mdc-button__touch']");

    public void sendusername(String uname){
        driver.findElement(username).sendKeys(uname);
    }
    public void contclick(){
        driver.findElement(contbutton).click();
    }
    public void sendpass(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void sendconfirmpass(String confirmpass){
        driver.findElement(confirm).sendKeys(confirmpass);
    }
    public void contclick2(){
        driver.findElement(contbutton2).click();
    }
}
