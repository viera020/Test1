package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.String;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;
    String base_url = "https://www.saucedemo.com/";


    @Given("On Login Page")
    public void on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(base_url);

        String loginPageAssert = driver.findElement(By.xpath("//h2[contains(text(), 'hai, saucedemo')]")).getText();
        Assert.assertEquals(loginPageAssert, "hai, saucedemo");


    }
    @When("User Enter Registered Username")
    public void user_enter_registered_username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @And("User Enter Registered Password")
    public void user_enter_registered_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("Click Login Button")
    public void click_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("User in Homepage")
    public void user_in_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Login Page saucedemo")
    public void loginPageSaucedemo() {
    }

    @Then("User in Dashboard Page")
    public void userInDashboardPage() {
        driver.findElement(By.xpath("//div[contains(text(), 'dashboard')]"));
    }

    @And("User Enter Unregistered Password")
    public void user_enter_unregistered_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce123");
    }
}
