package co.testcase;

import org.testng.annotations.Test;

import co.business.loginbusiness;
import co.page.loginpage;
import co.util.loginutil;

public class logintestcase extends loginutil{
	@Test
public void qq() throws InterruptedException {
	loginbusiness a=new loginbusiness();
	a.loginb();
	}	
}
