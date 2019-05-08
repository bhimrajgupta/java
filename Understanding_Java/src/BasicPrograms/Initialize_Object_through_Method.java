package BasicPrograms;

class Students {
	int rollNo;
	String name;

	void insertRecord(int r, String n) {
		rollNo = r;
		name = n;
	}

	void displayInfo() {
		System.out.println(rollNo + " " + name);
	}
}

public class Initialize_Object_through_Method {

	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students();

		s1.insertRecord(404, "Rex");
		s2.insertRecord(400, "Ted");

		s1.displayInfo();
		s2.displayInfo();
	}
}
