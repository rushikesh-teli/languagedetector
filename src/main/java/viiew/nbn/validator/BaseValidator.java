package viiew.nbn.validator;

import java.io.File;
import java.io.InputStream;

import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MimeTypes;

public class BaseValidator {
	
	protected Metadata getMetadata(String fileName) {
		Metadata metadata = new Metadata();
        metadata.set(Metadata.RESOURCE_NAME_KEY, fileName);
		return metadata;
	}

	protected MimeTypes getMimeRegistry() {
		TikaConfig tikaConfig = getTikaConfig();
		MimeTypes mimeRegistry = tikaConfig.getMimeRepository();
		return mimeRegistry;
	}

	protected TikaConfig getTikaConfig() {
		TikaConfig tikaConfig = TikaConfig.getDefaultConfig();
		return tikaConfig;
	}
	
	protected Detector getDetector(){
		TikaConfig tikaConfig = getTikaConfig();
		Detector detector = tikaConfig.getDetector();
		return detector;
	}

	@SuppressWarnings("deprecation")
	protected InputStream getTikaInputStream(String fileName) throws Exception {
		InputStream stream = TikaInputStream.get(new File(fileName));
		return stream;
	}
}
