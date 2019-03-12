package com;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class test01 {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void setUp() throws Exception {
	  //����ȸ������·��
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	  //����ȸ������
	driver = new ChromeDriver();
	//�������ַ
    baseUrl = "file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/autotest.html";
    //ȫ�ֵȴ�
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test  //��������������
  public void testUntitled() throws Exception {
	  //�򿪱�����ַ
    driver.get(baseUrl);
    driver.findElement(By.id("accountID")).clear();
    driver.findElement(By.id("accountID")).sendKeys("����");
    driver.findElement(By.id("passwordID")).clear();
    driver.findElement(By.id("passwordID")).sendKeys("123456");
    new Select(driver.findElement(By.id("areaID"))).selectByVisibleText("������");
    driver.findElement(By.id("sexID2")).click();
    driver.findElement(By.id("u1")).click();
    driver.findElement(By.id("u3")).click();
    driver.findElement(By.name("file")).clear();
    driver.findElement(By.name("file")).sendKeys("C:\\Users\\18379\\Desktop\\����java.txt");
    driver.findElement(By.id("buttonID")).click();
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }
}
