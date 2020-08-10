package com.andre;
public class Message {
	
	public String showMsgTypeYourName(){
	   return "Type your complete name: ";
	}

	public String showMsgYourNameAgeIs(String name, Integer age){
		
		String msg = "";
		
		if(name != null && age != null) {
			
			msg = "Hello my friend " + name + " your age is: " + age + ".";
			
		} else {
			
			if(name == null) {
				msg = "Hello my friend your age is: " + age + ".";
			}
			if(age == null) {
				msg = "Hello my friend " + name + ".";
			}
		}
		
		return msg;
	}

	public String showMsgTypeYourYearOfBirth(){
		return "Type your year of birth: ";
	}
}