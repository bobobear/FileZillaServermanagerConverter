package at.geos.FilezillaFileConverter.Exception;

public class FileReadException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public FileReadException(Exception e) {
		super(e);
	}
}
