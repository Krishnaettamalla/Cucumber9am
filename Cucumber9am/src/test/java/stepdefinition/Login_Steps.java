package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_Steps {
	// ctrl+shift+o

	WebDriver driver;

	@Given("User should be in login page")
	public void user_should_be_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "../Cucumber9am/browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter username {string}")
	public void user_enter_username(String userN) {
		driver.findElement(By.xpath("//div//input[@name='username']")).sendKeys(userN);

	}

	@And("User enter password {string}")
	public void user_enter_password(String passW) {
		driver.findElement(By.xpath("//div//input[@name='password']")).sendKeys(passW);
	} 		

	@And("User click login button")
	public void user_click_login_button() {
		driver.findElement(By.xpath("//div//button[@type='submit']")).click();
	}

	@And("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
		String expTitle = driver.getTitle();
		System.out.println(expTitle);
		Assert.assertEquals("Home | Pega Studio Training Web Application", expTitle);
	}

}
