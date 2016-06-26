package viiew.nbn.validator;

import org.junit.Test;

import viiew.nbn.BaseTest;

public class MimeTypeValidatorTest extends BaseTest {
	
	@Test
	public void testValidateMimeType() {
		MimeTypeValidator mv = new MimeTypeValidator();
		try {
			assertEquals(false, mv.validateMimeType(testResourcePath + "Sample.pdf"));
		} catch (Exception e) {
			fail("Exception");
		}
		assertTrue(true);
	}

	@Test
	public void testValidateMimeTypeByName() {
		MimeTypeValidator mv = new MimeTypeValidator();
		try {
			assertEquals(true, mv.validateMimeTypeByFileName(testResourcePath + "Sample.txt"));
		} catch (Exception e) {
			fail("Exception");
		}
		assertTrue(true);
	}
	
	@Test
	public void testValidateMimeTypeByMagic() {
		MimeTypeValidator mv = new MimeTypeValidator();
		try {
			assertEquals(true, mv.validateMimeTypeByMagic(testResourcePath + "Sample-EN.txt"));
		} catch (Exception e) {
			fail("Exception");
		}
		assertTrue(true);
	}
	
	@Test
	public void testValidateMimeTypeByDetector() {
		MimeTypeValidator mv = new MimeTypeValidator();
		try {
			assertEquals(true, mv.validateMimeTypeByDetector(testResourcePath + "Sample-valid.txt"));
		} catch (Exception e) {
			fail("Exception");
		}
		assertTrue(true);
	}
}
