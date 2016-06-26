package viiew.nbn.validator;

import static viiew.nbn.utils.AppConstants.MIME_TYPE_TEXT;

import java.io.InputStream;

import org.apache.tika.detect.Detector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MimeTypes;

public class MimeTypeValidator extends BaseValidator{
	
	public boolean validateMimeType(String fileName) throws Exception{
		boolean isValidMimeFileName = validateMimeTypeByFileName(fileName);
		boolean isValidMimeMagic = validateMimeTypeByMagic(fileName);
		boolean isValidMimeDetector = validateMimeTypeByDetector(fileName);
		
		return isValidMimeFileName && isValidMimeMagic && isValidMimeDetector;
	}

	protected boolean validateMimeTypeByFileName(String fileName) throws Exception {
		boolean isValid;
		String mimeType = "";
		System.out.println("Detecting MIME TYPE of (based on filename)  : [" + fileName + "]");
		MimeTypes mimeRegistry = getMimeRegistry();
		Metadata metadata = getMetadata(fileName);
        
        MediaType mediaType = mimeRegistry.detect(null, metadata);
        mimeType = mediaType!=null?mediaType.toString():"";
        System.out.println("MIME TYPE of (based on filename) is : [" + mimeType + "]");
        
        isValid = MIME_TYPE_TEXT.equals(mimeType);
		return isValid;
	}
	
	protected boolean validateMimeTypeByMagic(String fileName) throws Exception {
		boolean isValid;
		String mimeType = "";
		System.out.println("Detecting MIME TYPE of (based on MAGIC)  : [" + fileName + "]");
		InputStream stream = getTikaInputStream(fileName);
		MimeTypes mimeRegistry = getMimeRegistry();
		Metadata metadata = getMetadata(fileName);
        
        MediaType mediaType = mimeRegistry.detect(stream, metadata);
        mimeType = mediaType!=null?mediaType.toString():"";
        System.out.println("MIME TYPE of (based on MAGIC) is : [" + mimeType + "]");
		
        isValid = MIME_TYPE_TEXT.equals(mimeType);
		return isValid;
	}
	
	protected boolean validateMimeTypeByDetector(String fileName) throws Exception {
		boolean isValid;
		String mimeType = "";
		System.out.println("Detecting MIME TYPE of (based on Detector interface)  : [" + fileName + "]");
		InputStream stream = getTikaInputStream(fileName);
		Detector detector = getDetector();
		Metadata metadata = getMetadata(fileName);
		
        MediaType mediaType = detector.detect(stream, metadata);
        mimeType = mediaType!=null?mediaType.toString():"";
        System.out.println("MIME TYPE of (based on Detector interface) is : [" + mimeType + "]");
		
        isValid = MIME_TYPE_TEXT.equals(mimeType);
		return isValid;
	}
}
