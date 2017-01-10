package at.geos.FilezillaFileConverter.Converter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPlaintextConverter {

	private String TEST_STRING = "<Pass>test_string</Pass>";
	private String TEST_STRING_ENCODED = "<Pass>dGVzdF9zdHJpbmc=</Pass>";
	private String EMPTY_PASSWORD_STRING = "<Pass></Pass>";
	
	Converter converter;
	
	@Before
	public void setup() {
		converter = new PlaintextConverter();
	}
	
	@Test
	public void testPasswordConversion() {		
		assertEquals(TEST_STRING, converter.convertString(TEST_STRING_ENCODED));
	}
	
	@Test
	public void testEmptyPassword() {
		assertEquals(EMPTY_PASSWORD_STRING, converter.convertString(EMPTY_PASSWORD_STRING));
	}

}
