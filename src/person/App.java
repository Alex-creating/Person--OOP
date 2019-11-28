package person;

public class App {

	public static void main(String[] args) {
		
		Person luke = new Person(22, "Luke", "Software ");
		Person jordan = new Person(32, "Jordan", "Trainer");
		Person bob = new Person (53, "Bob", "Builder");
		Person phil = new Person (8, "Phil", "Supreme Leader");
		
		
		PersonManager peeps = new PersonManager();
		peeps.addToList(luke);
		peeps.addToList(jordan);
		peeps.addToList(bob);
		peeps.addToList(phil);
	 
		peeps.printAllDetails();
		
		peeps.searchPeople("Luke").printDetails();
	}

}
