package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class personal_infoPage {
    private WebDriver driver;
    public personal_infoPage(WebDriver driver){
        this.driver=driver;
    }
    By fname = By.id("input_first_name");
    By lname = By.xpath("//input[@id='input_last_name']");
    By phonedrop=By.xpath("//div[@class='prefix-phone-select mdc-select mdc-select--outlined prefix-component']//div[@class='mdc-select__anchor']");
    By phonedropval = By.xpath("//li[@class='mdc-deprecated-list-item mdc-deprecated-list-item--selected']");
    By phone = By.xpath("//input[@name='phone[number]']");
    By continuebutton=By.xpath("//button[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details-part-2 mdc-ripple-upgraded']//span[@class='mdc-button__touch']");
    public void sendname1(String name1){
        driver.findElement(fname).sendKeys(name1);
    }
    public void sendname2(String name2)
    {
        driver.findElement(lname).sendKeys(name2);
    }
    public void choosephonesign(){
        driver.findElement(phonedrop).click();
        driver.findElement(phonedropval).click();
    }
    public void sendphone(String num){
        driver.findElement(phone).sendKeys(num);
    }
    public void clickoncontinue(){
        driver.findElement(continuebutton).click();
    }
}



