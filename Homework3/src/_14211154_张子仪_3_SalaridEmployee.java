package homework3;

public class _14211154_������_3_SalaridEmployee extends _14211154_������_3_Employee {
	double weeklySalary;

	public _14211154_������_3_SalaridEmployee(String firstName,String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
	}
	public double getWeeklySalary() {
		return this.weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return this.getWeeklySalary()*4;
	}
	@Override
	public String toString() {
		return "FirstName��" + this.firstName+ "\nlastName��" +this.lastName 
				+ "\n socialSecurityNumber��" + this.socialSecurityNumber 
				+ "\n���Ĺ���Ϊ��SalaridEmployee"  + "\n �ù��ֵ���нΪ��"+ this.getWeeklySalary() ;
	}
	
}
