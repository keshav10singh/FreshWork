package com.qakeshav.javaconcept.filehandling;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class CreateJSONfile {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		JSONObject obj=new JSONObject();
		obj.put("name", "keshav");
		obj.put("location", "india");
		
		try
		{
		FileWriter file=new FileWriter("myJSON.json");
		file.write(obj.toString());	
		file.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
System.out.println(obj);
	}
	}

