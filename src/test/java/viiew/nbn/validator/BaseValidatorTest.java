package viiew.nbn.validator;

import java.io.File;

import org.apache.tika.metadata.Metadata;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BaseValidatorTest extends TestCase {

	private String testResourcePath;
	
	@Before
    public void setUp() {
        File testResourcesDirectory = new File("src/test/resources/files");
        testResourcePath = testResourcesDirectory.getAbsolutePath();
    }
	
	@Test
	public void testGetMetadata() {
		BaseValidator bvTest = new BaseValidator();
		assertNotNull(bvTest.getMetadata("Sample.txt"));
		assertEquals("A.txt", bvTest.getMetadata("A.txt").get(Metadata.RESOURCE_NAME_KEY)); 
	}
	
	@Test
	public void testGetMimeRegistry() {
		BaseValidator bvTest = new BaseValidator();
		assertNotNull(bvTest.getMimeRegistry());
	}
	
	@Test
	public void testGetDetector() {
		BaseValidator bvTest = new BaseValidator();
		assertNotNull(bvTest.getDetector());
	}
	
	@Test
	public void testGetTikaInputStream() {
		BaseValidator bvTest = new BaseValidator();
		try {
			assertNotNull(bvTest.getTikaInputStream(testResourcePath + "/Sample.txt"));
			assertTrue(true);
		} catch (Exception e) {
			fail("Exception");
		}
	}
	
	@Test
	public void testGetTikaConfig(){
		BaseValidator bvTest = new BaseValidator();
		assertNotNull(bvTest.getTikaConfig());
	}
}
