package com.andre;
import java.util.Calendar;

public class Person {

	private String name;		
	private Integer yearOfBirth;

	public String getName(){

		String arrayName[] = this.name.split(" ", 3);

		return arrayName[0] + " " + arrayName[2];	
	}
	public void setName(String name){
		this.name = name;
	}
	public Integer getAge(){

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		if(yearOfBirth != null) {
			return currentYear - this.getYearOfBirth();
		} else {
			return yearOfBirth;
		}
		
	}
	public Integer getYearOfBirth(){
		return this.yearOfBirth;	
	}
	public void setYearOfBirth(Integer yearOfBirth){
		this.yearOfBirth = yearOfBirth;
	}
}
	

	
