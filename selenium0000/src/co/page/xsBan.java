package co.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import co.util.loginutil;

public class xsBan extends loginutil{
	//����ַ
		public void openurl() {
			driver.get(ur);
		}
		//�û�������,��������
		public void setusername() {
			driver.findElement(By.name("username")).sendKeys("hujianming");
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
	//���ѧ������
	public void xs() {
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[1]/a")).click();	
	}
	//�������ѧ��
	public void xzxs() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
	}
	//��������ѧ����Ϣ
	public void xsxx(String a) {
		driver.findElement(By.name("u_username")).sendKeys(a);
		driver.findElement(By.name("u_userpass")).sendKeys("123");
		new Select(driver.findElement(By.name("u_branchid"))).selectByIndex(1);
		new Select(driver.findElement(By.name("u_positionid"))).selectByIndex(1);
		driver.findElement(By.name("u_realname")).sendKeys("����");
		driver.findElement(By.name("u_score")).sendKeys("10");
		new Select(driver.findElement(By.name("u_status"))).selectByIndex(0);
		driver.findElement(By.xpath("//*[@id=\"form_user_add\"]/table/tfoot/tr/td/button[1]")).click();	
	}
	
	
	
	
	
	
	
	
	
	
	
}
