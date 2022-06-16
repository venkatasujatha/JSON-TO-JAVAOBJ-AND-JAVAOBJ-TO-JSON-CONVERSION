package com.example.demo.Client;

import java.io.IOException;

import com.example.demo.Bean.Employee;
import com.example.demo.Util.JsonUtil;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpno(101);
		emp.setName("sujatha");
		emp.setSalary(50000);
		
		Employee emp1=new Employee();
		emp1.setEmpno(102);
		emp1.setName("suji");
		emp1.setSalary(20000);
		
		//convert javaobj to json
		
		try {
			String jsonemployee=JsonUtil.convertToJson(emp);
			String jsonemployee1=JsonUtil.convertToJson(emp1);
			System.out.println(jsonemployee);
			System.out.println(jsonemployee1);
			System.out.println("=========");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//convert json to javaobj
		
		try
		{
			String jsonemployee=JsonUtil.convertToJson(emp);
			Employee convertJsonToObj = JsonUtil.convertJsonToObj(jsonemployee, Employee.class);
			System.out.println(convertJsonToObj);
			System.out.println(convertJsonToObj.getEmpno()+" "+convertJsonToObj.getName()+" "+convertJsonToObj.getSalary());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
