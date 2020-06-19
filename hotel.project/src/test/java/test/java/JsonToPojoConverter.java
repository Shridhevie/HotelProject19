package test.java;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Sridevi
 *
 */
public class JsonToPojoConverter {

	// PojoToJson
	/**
	 * @param object
	 * @return str
	 */
	public static String convertToJson(Object object) {
		String str = null;
		ObjectMapper objMapper = new ObjectMapper();
		try {
			str = objMapper.writeValueAsString(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	// JsonToPojo
	/**
	 * @param str
	 * @param type
	 * @return object
	 */
	public <T> T convertToPojo(String str, Class<T> type) {
		T object = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			object = objectMapper.readValue(str, type);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return object;
	}
}

