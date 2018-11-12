import java.util.Calendar;
import java.util.Scanner;

public class Person {
	private String name;
	private int birthYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person() {

	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public int age() {
		int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
		return age;
	}
	public String input() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name");
		name = input.nextLine();

		return name;
		
	} 
	
	public String toString() {
		return "Name - "+ name + " birthYear - "+ birthYear+ " age - " + age();
	}
	
	public String changeName(String s) {
		this.name= s;
		return name; 
	}
	
}
