package pageEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	

	public class Dashboard {
	    @FindBy(className = "oxd-userdropdown-tab")
	    public WebElement btnProfileTab;
	    @FindBy(partialLinkText = "Logout")
	    public WebElement logOutLink;
	    @FindBy(className = "oxd-main-menu-item--name")
	    public List<WebElement> menus;

	    public Dashboard(WebDriver driver) {

	        PageFactory.initElements(driver, this);
	    }

	    public void doLogout() {
	        btnProfileTab.click();
	        logOutLink.click();
	    }
	}
}
