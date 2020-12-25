package website;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Testing {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.grootan.com/");
		
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[1]")).click();
	takeScreenshot("Home");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]")).click();
	takeScreenshot("Services");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[3]")).click();
	takeScreenshot("Open Source");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[4]")).click();
	
	takeScreenshot("Blog");
	Thread.sleep(4000);
	
	driver.get("https://www.grootan.com/team");
	
	takeScreenshot("Team");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[6]")).click();
	takeScreenshot("Careers");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[7]")).click();
	takeScreenshot("Contact Us");
	Thread.sleep(2000);
	driver.close();
	
	}
	public static void takeScreenshot(String fileName) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("D:\\Grootan\\Demo\\src\\Folder1\\"+fileName+".jpg"));
	}

}
