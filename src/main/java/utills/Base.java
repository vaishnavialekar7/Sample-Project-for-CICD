package utills;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Properties properties;
	public Actions action;
	public TakesScreenshot capture ;

	@BeforeClass
	public void LaunchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		action= new Actions(driver);
		properties = new Properties();
	
		try {

			InputStream input = new FileInputStream(
					"C:\\Users\\HP\\eclipse-workspace\\samplePrjforJenkins\\src\\test\\resources\\config.properties");
			properties.load(input);

		}

		catch (Exception e) {

			System.out.println("FileNotFound or please set proper path");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();

	}
}