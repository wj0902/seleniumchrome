package co.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import co.util.loginutil;

public class xsBan extends loginutil{
	//打开网址
		public void openurl() {
			driver.get(ur);
		}
		//用户名输入,密码输入
		public void setusername() {
			driver.findElement(By.name("username")).sendKeys("hujianming");
			driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		}
		//选择类型
		public void selectlx() {
			new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("管理员");
		}
		//点击登录
		public void clicklogin() {
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
		}
	//点击学生管理
	public void xs() {
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[1]/a")).click();	
	}
	//点击新增学生
	public void xzxs() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
	}
	//输入新增学生信息
	public void xsxx(String a) {
		driver.findElement(By.name("u_username")).sendKeys(a);
		driver.findElement(By.name("u_userpass")).sendKeys("123");
		new Select(driver.findElement(By.name("u_branchid"))).selectByIndex(1);
		new Select(driver.findElement(By.name("u_positionid"))).selectByIndex(1);
		driver.findElement(By.name("u_realname")).sendKeys("王导");
		driver.findElement(By.name("u_score")).sendKeys("10");
		new Select(driver.findElement(By.name("u_status"))).selectByIndex(0);
		driver.findElement(By.xpath("//*[@id=\"form_user_add\"]/table/tfoot/tr/td/button[1]")).click();	
	}
	
	
	
	
	
	
	
	
	
	
	
}
