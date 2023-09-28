import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;
import pages.genderpage;
import pages.personal_infoPage;

import java.util.concurrent.TimeUnit;

public class logintest {
    WebDriver driver;
    HomePage p1;
    LoginPage l1;
    personal_infoPage i1;
    genderpage g1;
    @DataProvider(name = "signupinformations")
    public Object[][] getdata(){
        Object[][] data={
                {"mohammed20191700150@gmail.com","Ahmed@3omar","mohamed","emad","01522879311"},
                {"mohammed20191700166@gmail.com","CV@3emad","mohamed","emad","01045236987"}
        };
        return data;
    }
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.jumia.com.eg/en");
    }
    @Test(priority = 0)
    public void closepopup(){
        p1 = new HomePage(driver);
        p1.closepop();
    }
    @Test(priority = 1)
    public void gotologin() throws InterruptedException {
        p1 = new HomePage(driver);
        p1.clickonaccount();
        p1.clickonsignin();
    }
    @Test(priority = 2,dataProvider = "signupinformations")
    public void howtologin(String mail,String pass,String fname,String lname,String phonenum)throws InterruptedException{
        l1=new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        l1.sendusername(mail);
        l1.contclick();
        l1.sendpass(pass);
        l1.sendconfirmpass(pass);
        Thread.sleep(9000);
        l1.contclick2();
        i1 = new personal_infoPage(driver);
        i1.sendname1(fname);
        i1.sendname2(lname);
        Thread.sleep(5000);
        i1.sendphone(phonenum);
        i1.clickoncontinue();
        g1= new genderpage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        g1.setGenderdrop();
        g1.setCalendar();
        Thread.sleep(5000);
        g1.setTermsandgo();
        Thread.sleep(5000);
        Assert.assertEquals(g1.setVerify(),"Hi, mohamed");
        g1.logout();
        gotologin();
    }
    @AfterClass
    public void exit(){
        driver.quit();
    }
}
