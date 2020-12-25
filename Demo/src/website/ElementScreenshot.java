package website;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.grootan.com/img/testimonials/lokesh.jpg");
		Thread.sleep(2000);
takeScreenshot1("CTO");
driver.get("https://www.grootan.com/img/testimonials/sasi.jpg");
Thread.sleep(2000);
takeScreenshot1("HR Manager");
driver.close();
	}
	private static void takeScreenshot1(String fileName) throws IOException {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("D:\\Grootan\\Demo\\Images\\"+fileName+".jpg"));
	}

}
