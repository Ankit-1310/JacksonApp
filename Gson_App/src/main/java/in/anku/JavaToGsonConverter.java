package in.anku;


import java.io.File;

import com.google.gson.Gson;

public class JavaToGsonConverter {

	public static void main(String[] args) throws Exception{
		
		Student stud = new Student();
		stud.setId(1);
		stud.setName("Ankit");
		stud.setAddress("Sarsi");
		
		Gson gson = new Gson();
		File file = new File(gson.toJson(stud));
		System.out.println("json is created");
	}

}
