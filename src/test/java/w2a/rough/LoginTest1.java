package w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;

import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;


public class LoginTest1  {

	public static void main(String[] args) {
		
		
		//the method which is responsible for taking to a page , should retun an obj of that page
		
		HomePage home=new HomePage();
		
	//goToLogin method is taking to LoginPage so it should return an obj of LoginPage
		LoginPage lp=home.goToLogin();
		
		//LoginPage
		
		ZohoAppPage zp=lp.doLogin("lougani2010@gmail.com", "bouchra83");
		
		//ZooAppPage
		
		zp.gotoCRM();
		//go to accounts
		AccountsPage account=Page.menu.gotoAccounts();
		//AccountsPage
		CreateAccountPage cap=account.gotoCreateAccounts();
		//CreateAccountsPage
		cap.createAccount("Rach");
		
		

	}

}
