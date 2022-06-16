package com.example.demo.Util;

import java.io.IOException;

import org.apache.el.parser.AstString;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
	
	//convert javaobj to json
	
	public static String convertToJson(Object object) throws JsonGenerationException, JsonMappingException,IOException
	{
		String jsonResult="";
		
		try {
			 jsonResult = mapper.writeValueAsString(object);
		} 
		catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
		return jsonResult;
		
	}
	
	//convert json to javaobj
	
	public static <T> T convertJsonToObj(String jsonString,Class<T> cls) throws JsonParseException,JsonMappingException,IOException
	{
		T readValue=null;
		try
		{
			 readValue = mapper.readValue(jsonString, cls);
		}
		catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		return readValue;
	}
}
