package at.geos.FilezillaFileConverter.Converter;

import java.util.Base64.Decoder;

public class PlaintextConverter extends Converter {

	@Override
	protected String encode(String password) {

		Decoder decoder = java.util.Base64.getDecoder();
		return new String(decoder.decode(password));
	}

}
