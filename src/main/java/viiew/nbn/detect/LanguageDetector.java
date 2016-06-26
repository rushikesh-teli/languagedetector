package viiew.nbn.detect;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.tika.language.LanguageIdentifier;
import org.apache.tika.language.LanguageProfile;

@SuppressWarnings("deprecation")
public class LanguageDetector {
	
	public String detectLanguage(String fileName){
		 LanguageIdentifier lang;
		 String iso639LangCode="";
		try {
			String fileContents = FileUtils.readFileToString(new File(fileName), UTF_8);
			lang = new LanguageIdentifier(new LanguageProfile(fileContents));
			iso639LangCode = lang.getLanguage();
	        System.out.println("The file's ISO 639 Language Code is : [" + iso639LangCode + "]");
		} catch (IOException e) {
			System.out.println("Error detecting language of file");
		}
		return iso639LangCode;
	}
}
