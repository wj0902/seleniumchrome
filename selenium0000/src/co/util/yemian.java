package co.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class yemian {
	public static WebDriver driver;
	public static String url;
	@BeforeClass
	public static void step() {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver=new ChromeDriver();
		url="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/autotest.html";
	}
	@AfterClass
	public void stepp() {
		
	}
}
