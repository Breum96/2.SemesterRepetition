package lambda.ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(new Person("Bent", 25), new Person("Susan", 34), new Person("Mikael", 60),
				new Person("Klaus", 44), new Person("Birgitte", 17), new Person("Liselotte", 9));
		List<Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		// opgave 1.a
		// Finder den første person i listen af personer med alderen 44.
		System.out.println("Alder 44 : " + findFirst(persons, (Person p) -> {
			return p.getAge() == 44;
		}));
		// opgave 1.b
		// Finder den første person i listen af personer med et navn der starter med 'S'.
		System.out.println("Starter med S: " + findFirst(persons, (Person p) -> {
			return p.getName().charAt(0) == 'S';
		}));
		// opgave 1.c
		// Finder den første person i listen af personer med et navn der indeholder mere end et ’i’. 
		System.out.println("Indeholder med end ét i: " + findFirst(persons, (Person p) -> {
			int count = 0;
			for (int i = 0; i < p.getName().length(); i++) {
				if (p.getName().charAt(i) == 'i') {
					count++;
				}

			}
			return count > 1;
		}));

		// opgave 1.d
		// Finder den første person i listen af personer med en alder der er lig længden af navnet. 
		System.out.println("Længden på navn er samme som alder: " + findFirst(persons, (Person p) -> {
			return p.getName().length() == p.getAge();
		}));

		// opgave 1.e
		List<Person> list1 = findAll(persons, p -> p.getAge() < 30);
		System.out.println(list1);

		// opgave 1.f
		// Find alle personer der har et navn der indeholder bogstavet 'i'.
		System.out.println("Alle navne der indeholder i : " + findAll(persons, (Person p) -> {
			return p.getName().contains("i");
		}));

		// opgave 1.g
		// Find alle personer der har et navn der starter med 'S'.
		System.out.println("Alle der starter med S : " + findAll(persons, (Person p) -> {
			return p.getName().charAt(0) == 'S';
		}));

		// opgave 1.h
		// Find alle personer der har et navn der med længde 5.
		System.out.println("Alle navne med længden 5 : " + findAll(persons, (Person p) -> {
			return p.getName().length() == 5;
		}));
		
		//opgave 1.i
		// Find alle personer der har et navn der med længde mindst 6 og alder under 40. 
		System.out.println("Alle hvor lænden på navn er mindst 6, og alder under 40 : " + findAll(persons, (Person p) -> {
			return p.getName().length() >= 6 && p.getAge() < 40;
		}));
		

		System.out.println();
	}

	/**
	 * Returns from the list the first person that satisfies the predicate. Returns
	 * null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	// opgave 1.e
	public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
		List<Person> persons = new ArrayList<Person>();
		for (Person p : list) {
			if (filter.test(p))
				persons.add(p);
		}
		return persons;
	}

}
