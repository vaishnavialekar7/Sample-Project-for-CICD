package samplePrjforJenkins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testone {

	 @Test
	    public void testOne() {
	        System.out.println("Running Test One");
	        Assert.assertTrue(true);
	    }

	    @Test
	    public void testTwo() {
	        System.out.println("Running Test Two");
	        Assert.assertEquals("Jenkins", "Jenkins");
	    }
	
}
