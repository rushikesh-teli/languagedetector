package viiew.nbn.validator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import static viiew.nbn.utils.AppConstants.pattern;

public class ContentValidator {

	public boolean validateContent(String fileName) {
		boolean isValid = false;
		boolean isEmptyFile = true;

		try {
			List<String> lines = Files.readAllLines(Paths.get(fileName));
			for (String line : lines) {
				if (!StringUtils.isEmpty(line)) {
					isEmptyFile = false;
					isValid = Pattern.matches(pattern, line);
					if (!isValid) {
						System.out.println("Invalid Line Contents :: " + line);
						break;
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Invalid Charset");
			isValid = false;
		}
		return !isEmptyFile && isValid;
	}
}
