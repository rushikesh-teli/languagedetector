package viiew.nbn.detect;

import org.junit.Test;

import viiew.nbn.BaseTest;

public class LanguageDetectorTest extends BaseTest{

	@Test
	public void testDetectLanguage(){
		LanguageDetector detector = new LanguageDetector();
		assertEquals("en", detector.detectLanguage(testResourcePath + "Sample-valid.txt"));
	}
}
