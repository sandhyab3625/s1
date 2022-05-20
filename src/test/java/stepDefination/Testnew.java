package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testnew {
	public class test2 {
		WebDriver driver;
		@Given("user is on facebook login")
		
		public void user_is_on_facebook_login() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
		}
		@When("^the_user_given_the (.*)_and_(.*)$")
		public void the_user_given_the_user_id_and_pasword(String name,String pass) {
			driver.findElement(By.id("email")).sendKeys(name);
			driver.findElement(By.id("pass")).sendKeys(pass);
		}
		
		@And("clicked_on_login_button()")
		public void clicked_on_login_button() {
			driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
			
		}
		
		@Then("navigated_to_the_home_page()")
		public void navigated_to_the_home_page() {
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}

	}

}
