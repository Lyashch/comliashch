package mail.ukr.net.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author sashaliashch
 *
 * This class store all the locators of Login Page
 *
 */


public class LoginPage {

    WebDriver  driver;

  By username=By.id("id-1");
  By password=By.id("id-2");
  By loginButton=By.xpath("/html/body/div[@class='app']/div/main[@class='main']/form[@class='form']/button[@class='button is-type-submit is-size-large form__submit']/div[@class='button__content']");


    public LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }


    public void typeUsername(){
    driver.findElement(username).sendKeys("liashch767");
    }

    public void typePassword(){
    driver.findElement(password).sendKeys("Lyashch86");
    }

    public void clickLogin(){
    driver.findElement(loginButton).click();
    }




//login
 //   /html/body/div[@class='app']/div/main[@class='main']/form[@class='form']/div[@class='input-text-modern form__field']/input[@id='id-1']

//*[@id="id-1"]
    // password
//     /html/body/div[@class='app']/div/main[@class='main']/form[@class='form']/div[@class='input-password-modern form__field']/div[@class='input-text-modern input-password-modern__field']/input[@id='id-2']

//    "
}
