package person;

public class Person {
	private int age;
	private String name;
	private String jobTitle;

	public Person(int age, String name, String jobTitle) {
		this.age = age;
		this.name = name;
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void printDetails() {
		System.out.println("Name is: " + this.name);
		System.out.println("Age is: " + this.age);
		System.out.println("Job is: " + this.jobTitle);
	}

}
