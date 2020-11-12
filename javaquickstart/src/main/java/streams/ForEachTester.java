package streams;

import java.util.ArrayList;
import java.util.List;

public class ForEachTester {

	public static void main(String args[]) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("haritha", "kosaraju"));
		list.add(new Person("akhil", "mandapati"));
		list.stream().forEach(p -> p.firstname.toUpperCase()); //it doesn't change the underlying source
		list.stream().forEach(p-> System.out.println(p.firstname.toUpperCase()));
	}
	
	static class  Person {
		private String firstname;
		private String lastname;
		
		public Person(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
	}
}
