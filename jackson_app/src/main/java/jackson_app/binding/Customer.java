package jackson_app.binding;

import lombok.Data;

@Data
public class Customer {
	 private int id;
	 private String name;
	 private String email;
	 private long pno;
	 private Address address;
	 
	 
}
