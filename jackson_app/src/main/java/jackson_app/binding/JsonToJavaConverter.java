package jackson_app.binding;

import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File file = new File("customer.json");
		ObjectMapper mapeer= new ObjectMapper();
		Customer readValue = mapeer.readValue(file, Customer.class);
		System.out.println(readValue);
	}

}
