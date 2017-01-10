package at.geos.FilezillaFileConverter.Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import at.geos.FilezillaFileConverter.Exception.FileWriteException;

public class FileContentWriter {

	public void writeFile(String filePath, String content) {

		try {
			File file = new File(filePath);

			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			
			br.write(content);
			br.close();
		} catch (IOException e) {
			throw new FileWriteException(e);
		}
	}
}
