package viiew.nbn.utils;

import org.junit.Test;

import junit.framework.TestCase;

public class AppConstaantsTest extends TestCase{
	
	@Test
	public void testConstants(){
		assertEquals("text/plain", AppConstants.MIME_TYPE_TEXT);
		assertEquals("[A-Za-z.,;: ]*", AppConstants.pattern);
	}
}
