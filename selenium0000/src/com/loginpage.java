package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginpage {
	static WebDriver driver;
	static String ur;
	@BeforeClass
	public void step() {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver=new ChromeDriver();
		ur="http://localhost:8080/examsys";
	}
	@Test
	public void a() throws InterruptedException {
		driver.get(ur);
		driver.findElement(By.name("username")).sendKeys("hujianming");
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement s=driver.findElement(By.name("usertype"));
		Select s1=new Select(s);
		s1.selectByVisibleText("管理员");
		Thread.sleep(9000);
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
		
		driver.switchTo().frame("main");
		String wen=driver.findElement(By.xpath("/html/body/div/div[1]/ul/li")).getText();
		System.out.println(wen);
		if (wen.equals("首页")) { 
			System.out.println("成功进入该系统");
		}else {
			System.out.println("进入该失败");
		}
	} 
	@AfterClass
	public void stup2() {
		driver.quit();
	}
}
