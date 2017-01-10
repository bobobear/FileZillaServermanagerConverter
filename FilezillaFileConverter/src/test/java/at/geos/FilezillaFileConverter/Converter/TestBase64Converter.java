package at.geos.FilezillaFileConverter.Converter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBase64Converter {
	
	Converter converter;
	private String TEST_STRING = "<Pass>test_string</Pass>";
	private String TEST_STRING_ENCODED = "<Pass>dGVzdF9zdHJpbmc=</Pass>";
	private String EMPTY_PASSWORD_STRING = "<Pass></Pass>";
	
	
	@Before
	public void setup() {
		converter = new Base64Converter();
	}

	@Test
	public void testPassword() {
		assertEquals(TEST_STRING_ENCODED, converter.convertString(TEST_STRING));		
	}

	@Test
	public void testEmptyPassword(){
		assertEquals(EMPTY_PASSWORD_STRING, converter.convertString(EMPTY_PASSWORD_STRING));
	}
	
}
