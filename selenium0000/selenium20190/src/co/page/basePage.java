package co.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import co.util.loginutil;

public class basePage extends loginutil{
	//��ת����߿��
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//��ת���ұ߿��
		public void tzyb() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
		
}
