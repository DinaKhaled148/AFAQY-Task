package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountInfoPage extends PageBase {
	WebDriver driver;

	public AccountInfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name="title")
	WebElement title;
	@FindBy(id = "password")
	WebElement password;
	
	// function that navigate to the second page 
	public void AccountInfoDataFill() throws InterruptedException {	
		click(title);
		sendvalues(password, "Abc@123");

	}




}