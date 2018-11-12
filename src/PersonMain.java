
public class PersonMain {

	public static void main(String[] args) {
		Person p1= new Person("Ira", 1996);
		Person p2 = new Person ("Olia", 1997);
		Person p3 = new Person ("Natalia", 1993);
		Person p4 = new Person ("Vitaliy", 1990);
		Person p5 = new Person ("Liubomyr", 1998);
		Person p6 = new Person ("Petro", 1990);
		
		
		p2.changeName("Olia");
		System.out.println(p2);
		p1.input();
		System.out.println(p1);

	}
	

}
