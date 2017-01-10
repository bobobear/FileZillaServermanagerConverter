package at.geos.FilezillaFileConverter.Converter;

import java.util.Base64.Encoder;

/**
 * Converts plaintext stored passwords to Base64 encoded 
 * 
 * @author geos
 *
 */

public class Base64Converter extends Converter {

	@Override
	protected String encode(String password) {		

		Encoder encoder = java.util.Base64.getEncoder();

		return encoder.encodeToString(password.getBytes());

	}

}
