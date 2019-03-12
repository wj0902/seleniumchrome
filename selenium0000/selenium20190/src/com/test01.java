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
	  //定义谷歌浏览器路径
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	  //定义谷歌浏览器
	driver = new ChromeDriver();
	//被测的网址
    baseUrl = "file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/autotest.html";
    //全局等待
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test  //操作，测试用例
  public void testUntitled() throws Exception {
	  //打开被测网址
    driver.get(baseUrl);
    driver.findElement(By.id("accountID")).clear();
    driver.findElement(By.id("accountID")).sendKeys("王军");
    driver.findElement(By.id("passwordID")).clear();
    driver.findElement(By.id("passwordID")).sendKeys("123456");
    new Select(driver.findElement(By.id("areaID"))).selectByVisibleText("北京市");
    driver.findElement(By.id("sexID2")).click();
    driver.findElement(By.id("u1")).click();
    driver.findElement(By.id("u3")).click();
    driver.findElement(By.name("file")).clear();
    driver.findElement(By.name("file")).sendKeys("C:\\Users\\18379\\Desktop\\王军java.txt");
    driver.findElement(By.id("buttonID")).click();
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }
}
