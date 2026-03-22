package pageComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TableW3school {

	WebDriver driver;
	Actions action;

	public TableW3school(WebDriver driver,Actions action ) {
		this.driver = driver;
		this.action=action;

	}

	public void IterateTable() {

		WebElement table = driver.findElement(By.id("customers"));
		
	
		action.scrollToElement(table).perform();

		List<WebElement> tablerow = table.findElements(By.tagName("tr"));

		for (WebElement  row : tablerow) {

			List<WebElement> column = row.findElements(By.tagName("td"));

			for (WebElement values : column) {

				System.out.println(values.getText());

			}

		}

	}

}
