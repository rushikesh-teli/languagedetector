package viiew.nbn;

import viiew.nbn.detect.LanguageDetector;
import viiew.nbn.utils.ArgumentParser;
import viiew.nbn.validator.FileValidator;

/**
 * Language Detector
 * @author Rushikesh
 */
public class App {
    public static void main( String[] args ) {        
        String fileName = ArgumentParser.getFileName(args);
        System.out.println("\n\n\n");	// For Maven Console
        System.out.println( "Detecting Language of File \'" + fileName + "\' using Apache Tika...\n" );
        
        FileValidator fileValidator = new FileValidator();
        if(fileValidator.validate(fileName)){
        	System.out.println("\nValid Contents in file :" + fileName + " Starting Language Detection....");
        	LanguageDetector langDetector = new LanguageDetector();
        	langDetector.detectLanguage(fileName);
        }else{
        	System.out.println("\nInvalid File Type OR Contents in file :" + fileName);
        }
        System.out.println("\n\n\n");	// For Maven Console
    }
}
