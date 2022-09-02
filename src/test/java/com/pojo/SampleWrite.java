package com.pojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleWrite {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File  filereader = new File("C:\\Users\\YOUSUF\\eclipse-workspace\\ApiProjects\\src\\test\\resources\\Write.json");

		ObjectMapper map = new ObjectMapper();

		List<EmpDetail> detail = new ArrayList<EmpDetail>();

		EmpDetail e1 = new EmpDetail("yousuf", "Java", "TN");
		EmpDetail e2 = new EmpDetail("irfan", "sql", "TN");
		EmpDetail e3 = new EmpDetail("aishu", "python", "TN");
		EmpDetail e4 = new EmpDetail("saravana", ".net", "TN");


		detail.add(e1);
		detail.add(e2);
		detail.add(e3);
		detail.add(e4);




		Emloyee e = new Emloyee("irfan", "irfan@gmail.com", 8870993415l,detail);

		map.writeValue(filereader, e);

	}

}
