package homework4;

public abstract class _14211154_������_4_Employee {
	String firstName;
	String lastName;
	String socialSecurityNumber;
	public _14211154_������_4_Employee(){}
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
	public void setSocialSecurityNumber(String social) {
		this.socialSecurityNumber=social;
	}
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	public _14211154_������_4_Employee(String firstName,String lastName,String socialSecurityNumber){
		this.setFirstName(firstName);
		this.firstName=this.getFirstName();
		this.setLastName(lastName);
		this.lastName=this.getLastName();
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public abstract double earning();
}
