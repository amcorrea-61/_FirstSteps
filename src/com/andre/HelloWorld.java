package com.andre;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args){

	  	String name;
	  	Integer yearOfBirth; 
	  	Integer age;
	  	Scanner scanner = new Scanner(System.in); 
		Message message = new Message();
		Math math = new Math();
		List<Person> personList = new ArrayList<Person>();
		String msgTypeYourName = message.showMsgTypeYourName();
		String msgTypeYourYearOfBirt = message.showMsgTypeYourYearOfBirth();
		String msgYourNameAgeIsPerson;
		String continua = "s";

		/*for(int i=0;i<3;i++) {
			
			Person person = new Person();
			
			System.out.println( msgTypeYourName );
			name = scanner.nextLine();
			person.setName(name);
			System.out.println( msgTypeYourYearOfBirt);
			yearOfBirth = Integer.valueOf(scanner.nextLine());
			person.setYearOfBirth(yearOfBirth);
			
			personList.add(person);
		}
		
		for(int i=0;i<3;i++) {

			msgYourNameAgeIsPerson = message.showMsgYourNameAgeIs(personList.get(i).getName(), personList.get(i).getAge());

			System.out.println( msgYourNameAgeIsPerson );
		}
		*/
		
		while(!continua.equals("n")) {
			Person person = new Person();
			
			System.out.println( msgTypeYourName );
			name = scanner.nextLine();
			person.setName(name);
			System.out.println( msgTypeYourYearOfBirt);
			yearOfBirth = Integer.valueOf(scanner.nextLine());
			person.setYearOfBirth(yearOfBirth);
			
			personList.add(person);
			
			System.out.println("Deseja continuar? ");
			continua = scanner.nextLine();
		}
		
		for(Person p :personList) {

			msgYourNameAgeIsPerson = message.showMsgYourNameAgeIs(p.getName(), p.getAge());

			System.out.println( msgYourNameAgeIsPerson );
		}

        System.exit( 0 ); //success
	}
}