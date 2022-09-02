package com.pojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleRead {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File  filereader = new File("C:\\Users\\YOUSUF\\eclipse-workspace\\ApiProjects\\src\\test\\resources\\Array.json");

		ObjectMapper map = new ObjectMapper();

		Emloyee e = map.readValue(filereader, Emloyee.class);
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println(e.getPhoneNo());

		
		

	}

}
