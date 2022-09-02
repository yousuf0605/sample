package jsonprojects;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonPgm1 {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader filereader = new FileReader("C:\\Users\\YOUSUF\\eclipse-workspace\\ApiProjects\\src\\test\\resources\\Testing.json");

		JSONParser jsonparser = new JSONParser();

		Object parse = jsonparser.parse(filereader);

		JSONObject jsonObject = (JSONObject)parse;
		Object object = jsonObject.get("data");

		JSONObject add = (JSONObject)object;
		Object object2 = add.get("id");
		Object object3 = add.get("email");
		Object object4 = add.get("first_name");
		Object object5 = add.get("last_name");
		Object object6 = add.get("avatar");

		System.out.println("Data");
		System.out.println("-----");
		System.out.println();

		System.out.println(object2+"\n"+object3+"\n"+object4+"\n"+object5+"\n"+object6);

		Object object1 = jsonObject.get("support");
		JSONObject add1 = (JSONObject)object1;
		Object object7 = add1.get("url");
		Object object8 = add1.get("text");

		System.out.println();
		System.out.println("Support");
		System.out.println("-------");
		System.out.println();

		System.out.println(object7+"\n"+object8);

	}





}
