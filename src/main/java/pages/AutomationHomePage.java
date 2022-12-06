package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationHomePage extends PageBase {

	public AutomationHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath ="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement signBtn;
	
	@FindBy(name = "name")
	WebElement nameField;
	@FindBy(name = "email")
	WebElement emailField;
	@FindBy(xpath = "//*[@id=\"form\"]//button[@data-qa=\"signup-button\"]")
	WebElement signupBTN;
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement email;
	
	public void Navigate() {
		click(signBtn);
	}
	public void signup() {
		sendvalues(nameField,"Dina");
		sendvalues(email,"Dina@gmail.com");
		click(signupBTN);
}

}
