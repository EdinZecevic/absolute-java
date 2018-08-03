package person;

public class Person {

	public String firstname;
	public String lastname;
	
	public Person() {
		firstname="no name";
		lastname="no surname";
	}
	
	public Person(String firstname) {
		setFirstName(firstname);
		lastname="no surname";
	}
	public Person(Person Person,String lastname) {
		firstname="no name";
		setLastName(lastname);
	}
	public Person(String firstname,String lastname) {
		setFirstAndLastName(firstname,lastname);
	}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
		}
	public void setLastName(String lastname) {
		this.lastname=lastname;
		}
	public void setFirstAndLastName(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String displayDetails() {
		return (firstname+" "+lastname);
	}
}
