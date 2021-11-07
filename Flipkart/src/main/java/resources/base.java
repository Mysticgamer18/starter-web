package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class base {
	
//	public static ExtentSparkReporter spark;
//	public static ExtentReports extent;

	
//	public base()
//	{
//	spark = new ExtentSparkReporter("htmlReport//index.html");
//	extent = new ExtentReports();
//	spark.config().setTheme(Theme.DARK);
//	spark.config().setDocumentTitle("Automate Report");
//	spark.config().setReportName("Extend Report");
//	extent.attachReporter(spark);
//	}
	
		public static WebDriver driver;
		public Properties prop;
		protected static ExtentTest test;
		
	public WebDriver initalizeDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Flipkart\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Flipkart\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\Hp\\eclipse-workspace\\Flipkart\\firefoxdriver.exe");
			 driver=new FirefoxDriver();
			
		}
	return driver;
	}
	public static String getScreenshot(String result) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"\\reports\\"+result+".png";
		
		FileUtils.copyFile(src,new File(path));
		return path;
	}

}
