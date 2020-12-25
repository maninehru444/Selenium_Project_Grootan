package website;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ReadImage {
static WebDriver driver;
@Test
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.grootan.com/img/testimonials/sasi.jpg");
Thread.sleep(2000);
takeScreenshot1("HR Manager");
BufferedImage expectedImage=ImageIO.read(new File(System.getProperty("D:\\Grootan\\Demo\\Images\\CTO.jpg")));
BufferedImage actualImage=takeScreenshot1("HR Manager");
ImageDiffer imgDiff=new ImageDiffer();
ImageDiff diff=imgDiff.makeDiff(expectedImage, actualImage);
Assert.assertFalse(diff.hasDiff(),"Images are same");
	}
private static BufferedImage takeScreenshot1(String fileName) throws Exception {
	
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("D:\\Grootan\\Demo\\Images\\"+fileName+".jpg"));
	return null;
	
	
}

}
