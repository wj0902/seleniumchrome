package co.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import co.util.loginutil;

public class tikupage extends loginutil{
	
	//点击题库管理
	public void tkgl() {
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
	}
	//点击新增题库
	public void xztk() {
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}
	
	//输入题库名称
	public void tkmc(String a) {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
		driver.findElement(By.name("d_name")).sendKeys(a);
	}
	//点击提交
			public void tj() {
				new Select(driver.findElement(By.name("d_status"))).selectByIndex(0);
				driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();	
			}
	
}
