package viiew.nbn.utils;

import org.junit.Test;

import junit.framework.TestCase;

public class ArgumentParserTest extends TestCase {
	
	@Test
	public void testGetFileNameNull(){
		assertEquals("", ArgumentParser.getFileName(null));
	}

	public void testGetFileNameValid(){
		String args[] = new String[]{"a.txt"};
		assertEquals("a.txt", ArgumentParser.getFileName(args));
	}
	
	public void testGetFileNameMoreArgs(){
		String args[] = new String[]{"Sample.txt","b.txt"};
		assertEquals("Sample.txt", ArgumentParser.getFileName(args));
	}
}
