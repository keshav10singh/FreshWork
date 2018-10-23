package com.qakeshav.javaconcept.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONfile {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub

		JSONParser parser=new JSONParser();
		
		try {
			//read json file
			 FileReader reader = new FileReader("myJSON.json");
			 JSONParser jsonParser = new JSONParser();
			 JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);


			
		//get a String from the JSOn object
		String name=(String)jsonObject.get("name");
		System.out.println("Name is "+name);
		String loc=(String)jsonObject.get("location");
		System.out.println("Location is "+loc);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
