package stepsDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import PageObjects.AccountLoginPage;
import PageObjects.HomePage;
import PageObjects.MyAccountPage;
import Utilities.DataReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
     WebDriver driver;
     HomePage hp;
     AccountLoginPage lp;
     MyAccountPage macc;
  
     List<HashMap<String, String>> datamap; //Data driven
     
   
    @Given("the user navigates to login page")
    public void user_navigate_to_login_page() {
    	
    	BaseClass.getLogger().info("Goto my account-->Click on Login.. ");
    	hp=new HomePage(BaseClass.getDriver());
    	
    	hp.clickMyAccount();
    	hp.ClickLogin();
                   
    }


    @When("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String pwd) {
        BaseClass.getLogger().info("Entering email and password.. ");
    	
    	lp=new AccountLoginPage(BaseClass.getDriver());
       	lp.setEmail(email);
        lp.setPassword_field(pwd);
        }

    @When("clicks on the Login button")
    public void click_on_login_button() {
        lp.clicklogin();
        BaseClass.getLogger().info("clicked on login button...");
    	
        
    }


    @Then("the user should be redirected to the MyAccount Page")
    public void user_navigates_to_my_account_page() {
    	macc=new MyAccountPage(BaseClass.getDriver());
		boolean targetpage=macc.isMyAccountPageExists();
				
		Assert.assertEquals(targetpage, true);
        
    }

    //*******   Data Driven test **************
    @Then("the user should be redirected to the MyAccount Page by passing email and password with excel row {string}")
    public void check_user_navigates_to_my_account_page_by_passing_email_and_password_with_excel_data(String rows)
    {
        try {
            datamap = DataReader.data(
                    System.getProperty("user.dir") + "/testData/Opencart_LoginData.xlsx",
                    "Sheet1"
            );
		} 
        catch (IOException e) 
        {
			e.printStackTrace();
            Assert.fail("Excel file not found or unable to read!");
		}

        int index=Integer.parseInt(rows)-1;
        if (datamap == null || datamap.size() == 0) {
            Assert.fail("Excel data is empty or not loaded properly!");
        }
        String email= datamap.get(index).get("username");
        String pwd= datamap.get(index).get("password");
        String exp_res= datamap.get(index).get("res");

        lp=new AccountLoginPage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword_field(pwd);

        lp.clicklogin();
        macc=new MyAccountPage(BaseClass.getDriver());
        try
        {
            boolean targetpage=macc.isMyAccountPageExists();
            System.out.println("target page: "+ targetpage);
            if(exp_res.equalsIgnoreCase("Valid"))
            {
                if(targetpage==true)
                {
                    MyAccountPage myaccpage=new MyAccountPage(BaseClass.getDriver());
                    myaccpage.accountLogout();
                    Assert.assertTrue(true);
                }
                else
                {
                    Assert.assertTrue(false);
                }
            }

            if(exp_res.equalsIgnoreCase("Invalid"))
            {
                if(targetpage==true)
                {
                    macc.accountLogout();
                    Assert.assertTrue(false);
                }
                else
                {
                    Assert.assertTrue(true);
                }
            }


        }
        catch(Exception e)
        {

            Assert.assertTrue(false);
        }
      }
 
}
