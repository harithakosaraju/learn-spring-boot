package javaquickstart;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private Date dob;
	
	public Person(int id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public boolean equals(Object other) {
		if(this == other)
			return true;
		if((other == null) || (other.getClass() != this.getClass()))
			return false;
		Person guest = (Person) other;
		return(this.id == guest.id &&
				this.name == guest.name &&
				this.dob == guest.dob);
	}
	
	@Override
	public int hashCode() {
		int result = 0;
		result = 31*result + id;
		result = 31*result + (this.name != null ? name.hashCode() :0);
		result = 31*result + (this.dob!= null ? dob.hashCode() : 0);
		return result;
	}
	
	@Override
	public String toString() {
		return this.name + this.dob;
	}
	public int compareTo(Person o) {
		return this.id - o.id;
	}
	public static void main(String args[]) {
		String str="1979-05-04";  
	    Date date1=Date.valueOf(str);
	    String str2="2009-07-31";  
	    Date date2=Date.valueOf(str2);
		Person p1 = new Person(2, "Haritha", date1);
		Person p2 = new Person(1, "Akhil", date2);
		Person p3 = new Person(1, "Haritha", date1);
		
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		
		final Person p4 = new Person(6, "Haritha", date1);
		
		// If the variable is final we cannot do reassignment.
		//p4 = new Person(5, "Akhil", date2);
		p4.setName("Vaishnavi");
		//You can change the state of the object
		System.out.println(p4);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		//Since person class implements comparable we can sort it using collections.sort.
		//They are sorted in natural order
		Collections.sort(persons);
		System.out.println(persons);
		NameSorting ns = new NameSorting();
		Person p5 = new Person(7, "Vaishnavi", date1);
		
		List<Person> personsList = new ArrayList<Person>();
		personsList.add(p1);
		personsList.add(p5);
		personsList.sort(ns);
		System.out.println(personsList);
	}
}
class NameSorting implements Comparator<Person> {
	
	public int compare(Person o1, Person o2) {
		return (o1.getName().equals(o2.getName()) ? 0 :
				o1.getName().compareTo(o2.getName()) > 0 ? 1 : -1);
	}
	
}
