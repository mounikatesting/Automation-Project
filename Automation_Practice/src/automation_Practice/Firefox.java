package automation_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	WebDriver driver;
	@Test
	public void openBrowser() throws IOException {
		 driver=new FirefoxDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.manage().window().maximize();
		System.out.println("navigate to getcalley home page");
		
		driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/']")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\mounika\\Screenshot\\calley.png"));
		System.out.println("Screenshot completed");
		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-lifetime-offer/']")).click();
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("C:\\Users\\mounika\\Screenshot\\calley1.png"));
		System.out.println("Screenshot completed");
		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/see-a-demo/']")).click();
		File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2,new File("C:\\Users\\mounika\\Screenshot\\calley2.png"));
		System.out.println("Screenshot completed");
		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-teams-features/']")).click();
		File src3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3,new File("C:\\Users\\mounika\\Screenshot\\calley3.png"));
		System.out.println("Screenshot completed");
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@href='https://www.getcalley.com/calley-pro-features/']")).click();
		File src4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4,new File("C:\\Users\\mounika\\Screenshot\\calley4.png"));
		System.out.println("Screenshot completed");
}
}


