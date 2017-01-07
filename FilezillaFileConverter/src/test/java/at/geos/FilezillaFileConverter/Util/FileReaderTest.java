package at.geos.FilezillaFileConverter.Util;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import at.geos.FilezillaFileConverter.Exception.FileReadException;

public class FileReaderTest {

	private final String FILE_CONTENT = "FileContent";
	private FileReader fileReader;
	private File file;
	
	@Rule
	public TemporaryFolder folder= new TemporaryFolder();

	@Before
	public void setup() {
		
		fileReader = new FileReader();			
		try {
			file = folder.newFile("testfile.txt");
			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			br.write(FILE_CONTENT);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void testReadFile() {		
		String readContent = fileReader.readFile(file.getAbsolutePath());
		assertEquals(FILE_CONTENT, readContent);
	}

	@Test (expected = FileReadException.class)
	public void testFileReadException() {
		String readContent = fileReader.readFile(file.getAbsolutePath() + "XXXX");
		fail();
	}
	
}
