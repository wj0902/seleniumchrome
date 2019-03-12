package co.testcase;

import org.testng.annotations.Test;

import co.business.xsglibus;
import co.util.loginutil;
@Test
public class xsxzglCase extends loginutil{
	xsglibus dd=new xsglibus();
	public void tyong() throws InterruptedException {
		dd.xsxzgl();
	}     
}
