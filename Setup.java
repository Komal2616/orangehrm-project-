package setup;

import org.testng.annotations.BeforeTest;

public class Setup {
	
	    public WebDriver driver;

	    @BeforeTest
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }

	    //@AfterTest
	    public void closeDriver() {
	        DashboardPage dashboardPage = new DashboardPage(driver);
//	      dashboardPage.doLogout();
	        driver.close();
	    }
	}

}
