package at.geos.FilezillaFileConverter.Exception;

public class FileWriteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FileWriteException(Exception e) {
		super(e);
	}

}
