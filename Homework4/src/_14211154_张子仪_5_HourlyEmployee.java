package homework5;

public class _14211154_������_5_HourlyEmployee extends _14211154_������_5_Employee {
	double wage;
	int hours;
	public double getWage() {
		return this.wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return this.hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public _14211154_������_5_HourlyEmployee(String firstName,String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return this.getWage()*this.getHours();
	}
	@Override
	public String toString() {
		return  "FirstName��" + this.firstName
				+ "\nlastName��" + this.lastName + "\n socialSecurityNumber��" + this.socialSecurityNumber  
				+"\n���Ĺ���Ϊ��HourlyEmployee" + "\n �ù���ÿСʱ����Ϊ��"+ this.getWage() + "\n���Ĺ���ʱ��Ϊ" + this.getHours()+"Сʱ" +"\n\n" ;
	}
	
}
