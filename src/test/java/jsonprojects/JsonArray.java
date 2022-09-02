package jsonprojects;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonArray {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader filereader = new FileReader("C:\\Users\\YOUSUF\\eclipse-workspace\\ApiProjects\\src\\test\\resources\\Array.json");

		JSONParser jsonparser = new JSONParser();

		Object parse = jsonparser.parse(filereader);

		JSONObject jsonObject = (JSONObject)parse;

		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("email"));
		System.out.println(jsonObject.get("phoneNo"));
		Object object5 = jsonObject.get("empDetails");

		JSONArray array = (JSONArray)object5;
		for (int i = 0; i < array.size(); i++) {

			Object object = array.get(i);

			JSONObject jsonObject1 = (JSONObject)object;
			System.out.println("-------------");
			System.out.println(jsonObject1.get("firstname"));
			System.out.println(jsonObject1.get("course"));
			System.out.println(jsonObject1.get("Address"));

		}


	}
}
