package viiew.nbn.validator;

import org.junit.Test;

import viiew.nbn.BaseTest;

public class ContentValidatorTest extends BaseTest {

	@Test
	public void test() {
		assertTrue(true);
	}
	
	public void testValidateContentInvalid(){
		ContentValidator cv = new ContentValidator();
		assertEquals(false, cv.validateContent(testResourcePath + "Sample.txt"));
	}
	
	public void testValidateContentValid(){
		ContentValidator cv = new ContentValidator();
		assertEquals(true, cv.validateContent(testResourcePath + "Sample-valid.txt"));
	}
	
	public void testValidateContentEmpty(){
		ContentValidator cv = new ContentValidator();
		assertEquals(false, cv.validateContent(testResourcePath + "Empty.txt"));
	}
}
