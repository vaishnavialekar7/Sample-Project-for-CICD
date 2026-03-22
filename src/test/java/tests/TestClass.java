package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageComponents.CheckUrl;
import pageComponents.TableW3school;
import utills.Base;
import utills.ScreenshotUtil;

public class TestClass extends Base {
	
	CheckUrl status;
	ScreenshotUtil capture;

	@Test (enabled=false)
	public void TestURLAccess() throws Exception {

		status = new CheckUrl(driver);
		System.out.println(
		
		System.getProperty("url"));
		int responsecode = status.checkUrlStatus("https://www.neml.in/#/home");

		Assert.assertEquals(responsecode, 200);

	}
	
	@Test(enabled=false)
	public void TestBrokenLinks() throws Exception {
		
		status = new CheckUrl(driver);
		status.BrokenLinks();
		
		
		
	}
	
	
	@Test
	public void TestTabelIteration() throws Exception {
		
		TableW3school table = new TableW3school(driver,action);
		table.IterateTable();
		ScreenshotUtil.Capture(driver);
	}
	
	
}
