package viiew.nbn.validator;

public class FileValidator {
	
	public boolean validate(String fileName){
		boolean isValidMimeType, isValidContent;
		
		MimeTypeValidator mimeTypeValidator = new MimeTypeValidator();
		try {
			isValidMimeType = mimeTypeValidator.validateMimeType(fileName);
			if(!isValidMimeType)return isValidMimeType;
		} catch (Exception e) {
			System.out.println("Failed to detect MIME Type");
			isValidMimeType = false;
			return isValidMimeType;
		}
		
		ContentValidator contentValidator = new ContentValidator();
		isValidContent = contentValidator.validateContent(fileName);
		
		return isValidContent && isValidMimeType;
	}

}
