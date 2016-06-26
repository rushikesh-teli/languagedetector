package viiew.nbn.validator;

import org.junit.Test;

import viiew.nbn.BaseTest;

public class FileValidatorTest extends BaseTest {

	@Test
	public void test() {
		assertTrue(true);
	}
	
	public void testValidateContentInvalid(){
		FileValidator fv = new FileValidator();
		assertEquals(false, fv.validate(testResourcePath + "Sample.txt"));
	}
	
	public void testValidateContentValid(){
		FileValidator fv = new FileValidator();
		assertEquals(true, fv.validate(testResourcePath + "Sample-valid.txt"));
	}
	
	public void testValidateContentEmpty(){
		FileValidator fv = new FileValidator();
		assertEquals(false, fv.validate(testResourcePath + "Empty.txt"));
	}
}
