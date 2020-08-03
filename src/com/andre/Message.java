package com.andre;
public class Message {
	
	public String showMsgTypeYourName(){
	   return "Type your complete name: ";
	}

	public String showMsgYourNameAgeIs(String name, Integer age){
	   return "Hello my friend " + name + " your age is: " + age + ".";
	}

	public String showMsgTypeYourYearOfBirth(){
		return "Type your year of birth: ";
	}
}