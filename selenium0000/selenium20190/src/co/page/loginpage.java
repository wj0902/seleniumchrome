package co.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import co.util.loginutil;

public class loginpage extends loginutil{
	//打开网址
	public void openurl() {
		driver.get(ur);
	}
	//用户名输入
	public void setusername() {
		driver.findElement(By.name("username")).sendKeys("hujianming");
	}
	//密码输入
	public void setpassword() {
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
	/*//点击题库
	public void tiku() {
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		driver.switchTo().defaultContent();
	}
	//新增题库
	public void tiku2() {
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
		driver.findElement(By.name("d_name")).sendKeys("123456");
		new Select(driver.findElement(By.name("d_status"))).selectByIndex(0);
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();		
	}*/
}






