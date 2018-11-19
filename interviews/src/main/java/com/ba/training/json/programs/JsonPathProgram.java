package com.ba.training.json.programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathProgram {

	public static void main(String[] args) {
	
		readFromFile();
  
	}
	
	private static void readFromFile() {
		
		JSONParser parser = new JSONParser();
		
		//Values from TOTP Program 
		String secCode = "0623"; //TOTP program
		
		
		//Values from setup.properties  
		String strDeviceId = "2"; //From setup.properties (NOTE : convert the string
		int deviceId = Integer.parseInt(strDeviceId);
		
		String appIdKey = "2306";//From setup.properties
		String accoutName = "sudhar";//From setup.properties
		String password = "loveyou";//From setup.properties
		
		 try {
			Object obj = parser.parse(new FileReader("src/main/resources/totp.json"));
			
			JSONObject jsonObject =  (JSONObject) obj;
			System.out.println("Original JSON ");
			System.out.println(jsonObject.toJSONString());


			DocumentContext jsonDoc = JsonPath.parse(jsonObject);
		
			//JSON Paths (refer to totop.json file)
			String secCodePath = "$.secondFactor.secCode";
			String deviceIdPath = "$.secondFactor.deviceId";
			String appIdKeyPath = "$.dsRequest.appCredentials.appIdKey";
			
			String accountPath = "$.account.accountName";
			String passwordPath = "$.account.password";
			
		
			DocumentContext newJsonDoc =    jsonDoc.set(secCodePath, secCode).set(deviceIdPath, deviceId).set(appIdKeyPath, appIdKey).set(accountPath,accoutName).set(passwordPath, password); 
			System.out.println("Modified JSON ");
			System.out.println(newJsonDoc.jsonString());
			

			
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
