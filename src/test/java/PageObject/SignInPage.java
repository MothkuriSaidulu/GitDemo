package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.AbstractClass;

public class SignInPage extends AbstractClass {

	public WebDriver driver;

	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/my-account/sign-up']")
	private WebElement signUp;

	@FindBy(xpath = "//h1[@class='mm-login-page__title']")
	private WebElement signInPageTitle;

// Actions
	public void clickOnSignUp() {
		waitWebElementToAppear(signInPageTitle);
		Assert.assertEquals(signInPageTitle.getText(), "Sign in to Money Mart");
		signUp.click();

	}
}
