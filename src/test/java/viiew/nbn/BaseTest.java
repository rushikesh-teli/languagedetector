package viiew.nbn;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BaseTest extends TestCase {
	protected String testResourcePath;
	
	@Before
    public void setUp() {
        File testResourcesDirectory = new File("src/test/resources/files/");
        testResourcePath = testResourcesDirectory.getAbsolutePath()+ File.separator;
    }

	@Test
	public void test(){
		assertTrue(true);
	}
}
