package BasicPrograms;

class Student {
	int id;
	String name;
}

public class Initialize_Object_through_reference {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 404;
		s1.name = "Rex";
		System.out.println(s1.id + " " + s1.name);
	}

}
