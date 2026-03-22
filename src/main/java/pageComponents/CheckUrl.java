package pageComponents;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckUrl {

	WebDriver driver;

	public CheckUrl(WebDriver driver) {

		this.driver = driver;

	}

	public int ResponseCode;

	public void BrokenLinks() throws Exception {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement w : links) {

			String FindedLink = w.getAttribute("href");

			if (FindedLink == null) {

				System.out.println("Null found ");
			}

			else {

				int responsecode = checkUrlStatus(FindedLink);

				if (responsecode == 200) {

					System.out.println(FindedLink + "Link is valid");
				}

				else {

					System.out.println(FindedLink + "Link is broken");
				}

			}

		}

	}

	public int checkUrlStatus(String link) throws Exception {

		if (link == null || link.isEmpty()|| link.startsWith("javascript") ||
				link.startsWith("mailto") ||
				link.startsWith("tel")) {

			System.out.println("Invalid Link");
		}

		else {

			URL url = new URL(link);

			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
			connect.setRequestMethod("GET");

			ResponseCode = connect.getResponseCode();
			if (ResponseCode == 200) {

				return ResponseCode;
			}

		}

		return 0;

	}

}
