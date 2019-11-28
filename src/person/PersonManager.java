package person;

import java.util.ArrayList;

public class PersonManager {

	ArrayList<Person> peopleList = new ArrayList<>();

	public void addToList(Person person) {

		peopleList.add(person);

	}

	public void printAllDetails() {
		for (Person i : peopleList) {
			i.printDetails();
			System.out.println();
		}
	}

	public Person searchPeople(String name) {
		for (Person i : this.peopleList) {
			if (i.getName().equals(name)) {
				return i;
			}
			
		}
		return null;

	}
}
