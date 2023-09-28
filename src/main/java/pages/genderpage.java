package pages;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class genderpage {
    WebDriver driver;
    public genderpage(WebDriver driver){
        this.driver=driver;
    }
    By genderdrop = By.xpath("//div[@aria-required='true']");
    By genderval = By.xpath("//li[@data-value='M']");
    By calendar =By.xpath("//input[@id='input_birth_date']");
    By terms=By.xpath("//input[@id='acceptTC']");
    By cont= By.xpath("//button[@id='confirmBtn']//span[@class='mdc-button__touch']");
    By Verify= By.xpath("//label[normalize-space()='Hi, mohamed']");
    By logoutmenu =By.xpath("//label[normalize-space()='Hi, mohamed']");
    By logoutbutton=By.xpath("//form[@class='-tac -hr _hx2 -fs0 -pas']");

    public void setGenderdrop(){
        driver.findElement(genderdrop).click();
        driver.findElement(genderval).click();
    }
    public void setCalendar(){
        driver.findElement(calendar).sendKeys("05-03-2000");
    }
    public void setTermsandgo(){
        driver.findElement(terms).click();
        driver.findElement(cont).click();
    }

    public String setVerify() {
        return driver.findElement(Verify).getText();
    }
    public void logout(){
        driver.findElement(logoutmenu).click();
        driver.findElement(logoutbutton).click();
    }
}
