package Tests;

import mail.ukr.net.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginToUkrNet {

    @Test
    public void LoginToUkrNet(){

        WebDriver driver = null;

         driver = new ChromeDriver();

        // driver.manage().window().maximize();
         driver.get("https://mail.ukr.net/desktop/login");

        LoginPage login = new LoginPage(driver);
        login.typeUsername();
        login.typePassword();
        login.clickLogin();

      //  driver.quit();

    }


}
