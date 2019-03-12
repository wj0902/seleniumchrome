package co.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import co.util.loginutil;

public class basePage extends loginutil{
	//Ìø×ªµ½×ó±ß¿ò¼Ü
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//Ìø×ªÖÁÓÒ±ß¿ò¼Ü
		public void tzyb() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
		
}
