package homework4;

public class _14211154_������_4_CommissionEmployee extends _14211154_������_4_Employee {
	double commissionRate=0.12;
	double grossSales;
	public double getGrossSales() {
		return this.grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return this.commissionRate;
	}
	public _14211154_������_4_CommissionEmployee(String firstName,String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	public _14211154_������_4_CommissionEmployee() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return this.grossSales*this.getCommissionRate();
	}
	@Override
	public String toString() {
		return   "FirstName��" +this. firstName
				+ "\nlastName��" +this. lastName + "\n socialSecurityNumber��" + this.socialSecurityNumber 
				+"\n���Ĺ���Ϊ��CommissionEmployee" + "\n���˴ε����۶�Ϊ��" +this. getGrossSales() + "\nCommissionRate��"
				+ this.getCommissionRate() ;
	}
	
}
