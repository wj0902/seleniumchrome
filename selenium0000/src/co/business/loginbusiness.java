package co.business;

import co.page.loginpage;

public class loginbusiness extends loginpage{
	public void loginb()  throws InterruptedException {
			loginpage page=new loginpage();
			page.openurl();
			page.setusername();
			page.setpassword();
			page.selectlx();
			Thread.sleep(9000);
			page.clicklogin();	
			/*page.tiku();
			page.tiku2();*/
	}	
}
