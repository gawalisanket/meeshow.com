package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
public static Properties prop;
	
	public static WebDriver driver;

	@BeforeTest
	public void loadConfig() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\sanket.gawali\\eclipse-workspace\\meeshow.com\\configuration\\config.prop");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public void launchApp() {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver(chromeOptions);
		} else if (browserName.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.contains("IE")) {
			driver = new InternetExplorerDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}	
	
	public void screenshot() throws Exception
	{
		TakesScreenshot shot = ((TakesScreenshot)driver);
		File file = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\sanket.gawali\\eclipse-workspace\\meeshow.com\\screenshot\\sanket.png"));
	}
	
	
	

}
