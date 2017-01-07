package at.geos.FilezillaFileConverter.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import at.geos.FilezillaFileConverter.Exception.FileReadException;

public class FileReader {
	
	public String readFile(String filePath) {
		
		StringBuilder sb = new StringBuilder();;
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File(filePath))));
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();

		} catch (FileNotFoundException e) {
			throw new FileReadException(e);
		} catch (IOException e) {
			throw new FileReadException(e);
		}		
		return sb.toString();
	}

}
