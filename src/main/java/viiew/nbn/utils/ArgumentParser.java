package viiew.nbn.utils;

public class ArgumentParser {
	
	public static String getFileName(String ...a){
		String fileName = "";
		if (a == null || a.length < 1) {
			System.out.println("Please pass file name as argument");
			System.out.println("Usage: App Sample.txt");
			//System.exit(0);
		} else {
			System.out.println("File Name :" + a[0]);
			fileName = a[0];
		}		
		return fileName;
	}

}
