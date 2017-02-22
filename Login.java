package Test;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Email;


public class Login {

    
    public void setup(){

    	WebDriver   d = new ChromeDriver();

        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        d.get("www.gmail.com"
        		+ "");

    }


    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

    Login obj = new Login();

    //Verify login page title

   String loginPageTitle =  obj.getLoginEmail();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application

     obj.loginToEmail("priyankabqa", "pathi143");

    // go the next page

    Email obj1 = new Email();

    //Verify home page

    Assert.assertTrue(obj1.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }


	private String getLoginEmail() {
		// TODO Auto-generated method stub
		return null;
	}


	private void loginToEmail(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
