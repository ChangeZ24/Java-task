package homework5;

public class _14211154_������_5_CommissionEmployee extends _14211154_������_5_Employee {
	double commissionRate;
	int grossSales;
	public double getGrossSales() {
		return this.grossSales;
	}
	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public _14211154_������_5_CommissionEmployee(String firstName,String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double earning() {
		// TODO Auto-generated method stub
		return this.getGrossSales()*this.getCommissionRate();
	}
	@Override
	public String toString() {
		return   "FirstName��" +this. firstName
				+ "\nlastName��" +this. lastName + "\n socialSecurityNumber��" + this.socialSecurityNumber 
				+"\n���Ĺ���Ϊ��CommissionEmployee" + "\n���˴ε����۶�Ϊ��" +this. getGrossSales() + "\nCommissionRate��"
				+ this.getCommissionRate()+"\n\n" ;
	}
	
}
