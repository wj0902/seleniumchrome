package co.page;

import org.openqa.selenium.By;

import co.util.yemian;

public class yepage extends yemian{
	public void x() {
		driver.get(url);
	}
	public void a() {
		driver.findElement(By.name("account")).sendKeys("123");
	}
	public void b() {
		driver.findElement(By.name("password")).sendKeys("456");
	}
	public void c() {
		driver.findElement(By.id("buttonID")).click();
	}
}
