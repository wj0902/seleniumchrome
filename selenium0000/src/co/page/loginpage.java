package co.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import co.util.loginutil;

public class loginpage extends loginutil{
	//����ַ
	public void openurl() {
		driver.get(ur);
	}
	//�û�������
	public void setusername() {
		driver.findElement(By.name("username")).sendKeys("hujianming");
	}
	//��������
	public void setpassword() {
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	}
	//ѡ������
	public void selectlx() {
		new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("����Ա");
	}
	//�����¼
	public void clicklogin() {
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
	}
	/*//������
	public void tiku() {
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		driver.switchTo().defaultContent();
	}
	//�������
	public void tiku2() {
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
		driver.findElement(By.name("d_name")).sendKeys("123456");
		new Select(driver.findElement(By.name("d_status"))).selectByIndex(0);
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();		
	}*/
}






