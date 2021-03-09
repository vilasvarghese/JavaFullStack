package com.vilas.java8_tutorial.ch04.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Example7_PartitionBy {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(
				new Employee("Vilas","Bangalore", 500),
				new Employee("John", "Mumbai", 900),
				new Employee("Eldho", "Culcutta", 300),
				new Employee("Alex", "Culcutta", 800)
				);
		
		Map<String, List<Employee>> result = new HashMap<>();
		for (Employee e : empList) {
		  String city = e.getCity();
		  List<Employee> empsInCity = result.get(city);
		  if (empsInCity == null) {
		    empsInCity = new ArrayList();
		    result.put(city, empsInCity);
		  }
		  empsInCity.add(e);
		}
		
		System.out.println(result);
		
		Map<String, List<Employee>> employeesByCity =
				empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		

		System.out.println(employeesByCity);
		
		Map<String, Long> numEmployeesByCity =
				empList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
		System.out.println(numEmployeesByCity);


		Map<String, Double> avgSalesByCity =
				empList.stream().collect(Collectors.groupingBy(Employee::getCity,
						Collectors.averagingInt(Employee::getSalesCount)));
		System.out.println(avgSalesByCity);

		//Partition By
		/*
		Partitioning 
**********			special kind of grouping, 
**********			resultant map contains at most two different groups – 
**********				one for true and one for false. 
**********			For example, we can find out best employees partitioning them into those 
**********				who made more than N sales and 
**********				those who didn’t, using the partitioningBy collector:
		*/
		Map<Boolean, List<Employee>> partitioned =
				empList.stream().collect(Collectors.partitioningBy(e -> e.getSalesCount() > 500));
		System.out.println(partitioned);
		
		Map<Boolean, Map<String, Long>> partitioned1 =
				empList.stream().collect(Collectors.partitioningBy(e -> e.getSalesCount() > 500,
						Collectors.groupingBy(Employee::getCity, Collectors.counting())));
		System.out.println(partitioned1);
	
		if (1==1) {
			return;
		}
	}
}

class Employee{
	private String name;
	private String city;
	private int salesCount;
	
	public Employee(String name, String city, int salesCount) {
		super();
		this.name = name;
		this.city = city;
		this.salesCount = salesCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(int salesCount) {
		this.salesCount = salesCount;
	}
}