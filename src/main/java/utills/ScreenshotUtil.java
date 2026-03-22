package utills;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenshotUtil {

	public TakesScreenshot capture;

	public static void Capture(WebDriver driver) throws Exception {

		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyHHmmss"));

		TakesScreenshot capture = (TakesScreenshot) driver;
		File Source = capture.getScreenshotAs(OutputType.FILE);
		File destinationFolder = new File("C:\\Users\\HP\\Pictures\\Screenshots\\" + time + ".png");

		FileUtils.copyFile(Source, destinationFolder);

	}

	public static void Capture(WebElement element) throws Exception {

		File Source = element.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyHHmmss"));

		File destinationFolder = new File("C:\\Users\\HP\\Pictures\\Screenshots\\" + time + ".png");

		FileUtils.copyFile(Source, destinationFolder);

	}

}
