package co.testcase;

import org.testng.annotations.Test;

import co.business.loginbusiness;
import co.business.xztkBusiness;
import co.util.loginutil;
@Test
public class xztiTestCase extends loginutil{
	loginbusiness login=new loginbusiness();
	xztkBusiness tk=new xztkBusiness();
	public void test() throws InterruptedException {
		login.loginb();
		
	}
}
