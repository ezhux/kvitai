package lt.kvitai;

import static org.junit.Assert.*;
import generated.ZinB;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import lt.kvitai.sodra.FileUploadController;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class TestParse {

	@Test
	public void test() {
		
		ClassLoader classLoader = getClass().getClassLoader();
		URL url = classLoader.getResource("input.xml");
		String fileString = url.getFile();
		File file = new File(fileString);
		ZinB zinB = FileUploadController.parseXml(file);
		assertNotNull(zinB);
	}

	@Test
	public void testStreamToString() {
	   assertNotNull("Test file missing", 
	               getClass().getResource("/input.xml"));
	}
	
}
