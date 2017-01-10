package at.geos.FilezillaFileConverter.Converter;

import java.util.Base64.Encoder;

public class Base64Converter extends Converter {

	@Override
	protected String encode(String password) {		

		Encoder encoder = java.util.Base64.getEncoder();

		return encoder.encodeToString(password.getBytes());

	}

}
