package jackson_app.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	
	public static void main(String[] args) throws Exception{
		
		Address address= new Address();
		address.setStreet("food street");
		address.setBlock("D");
		address.setCity("Delhi");
		address.setState("Delhi");
		Customer c= new Customer();
		c.setId(1);
		c.setName("Ankit");
		c.setEmail("ankit820581@gmail.com");
		c.setPno(7531013563l);
		c.setAddress(address);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("json file created");
	}

}
