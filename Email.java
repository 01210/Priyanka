package pages;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Email {

    private static final By Email = null;

	WebDriver d;

    By homePageUserName = By.xpath("www.gmail.com");

    

    public void Emaillog(WebDriver driver){

        this.d = driver;

    }

    

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

         return    
        		 d.findElement(Email).getText();

        }

}

