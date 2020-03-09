package co.learn.java8.elkin.consumer;

import java.util.List;
import java.util.function.Consumer;

import co.learn.java8.elkin.repo.Person;
import co.learn.java8.elkin.repo.PersonRepository;

public class ConsumerPersonExample {

	// Functional interfaces that we create for using them
	static Consumer<Person> c1 = (p) -> System.out.println(p);
	static Consumer<Person> c2 = (p) -> System.out.println(p.getName().toUpperCase());
	static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());
	static List<Person> personList = PersonRepository.getAllPersons();
	
	static void printNameAndHobbies() {
		personList.forEach(c2.andThen(c3));
	}

	static void printWithCondition() {
		personList.forEach(p -> { // iterate student
			if (p.getGender().equals("Male") && p.getHeight() >= 140) {
				c2.andThen(c3).accept(p);
			}
		});
	}
	
	public static void main(String[] args) {
		c1.accept(PersonRepository.getPerson());
		c2.accept(PersonRepository.getPerson());
		c3.accept(PersonRepository.getPerson());
		
		// We do the same three operation inside the same line of code
		c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());
		
		System.out.println(" ");
		System.out.println("New Method: ");
		printNameAndHobbies();
		
		System.out.println(" ");
		System.out.println("Last Method: ");
		printWithCondition();
		
	}
	
}
