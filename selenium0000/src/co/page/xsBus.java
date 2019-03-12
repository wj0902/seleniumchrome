package co.page;

import co.util.loginutil;

public class xsBus extends loginutil{
	public void zb() {
		driver.switchTo().frame("menu");
	}
	public void fhui() {
		driver.switchTo().defaultContent();
	}
	public void yb() {
		driver.switchTo().frame("main");
	}
}
