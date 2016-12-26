package homework5;

public abstract class _14211154_张子仪_5_Employee {
	String firstName;
	String lastName;
	String socialSecurityNumber;
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this. lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	public _14211154_张子仪_5_Employee(String firstName,String lastName,String socialSecurityNumber){
		this.setFirstName(firstName);
		this.firstName=this.getFirstName();
		this.setLastName(lastName);
		this.lastName=this.getLastName();
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public abstract double earning();
}
