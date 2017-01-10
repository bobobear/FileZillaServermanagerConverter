package at.geos.FilezillaFileConverter.Converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Searches the "<Pass></Pass>" tags in a String, and replaces the password with
 * the encoded version
 * 
 * @author geos
 *
 */
public abstract class Converter {

	public final String convertString(String source) {

		Matcher m = Pattern.compile("<Pass>.*</Pass>").matcher(source);

		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			String password = extractPassword(m.group());
			String converted = this.encode(password);

			m.appendReplacement(sb, "<Pass>" + converted);
			sb.append("</Pass>");
		}
		m.appendTail(sb);

		return sb.toString();
	}

	private String extractPassword(String passwordLine) {
		return passwordLine.substring(6, passwordLine.length() - 7);
	}

	protected abstract String encode(String password);

}
