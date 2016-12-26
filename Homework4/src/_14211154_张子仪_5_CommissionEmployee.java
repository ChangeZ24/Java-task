package homework5;

public class _14211154_张子仪_5_CommissionEmployee extends _14211154_张子仪_5_Employee {
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
	public _14211154_张子仪_5_CommissionEmployee(String firstName,String lastName,String socialSecurityNumber) {
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
		return   "FirstName：" +this. firstName
				+ "\nlastName：" +this. lastName + "\n socialSecurityNumber：" + this.socialSecurityNumber 
				+"\n您的工种为：CommissionEmployee" + "\n您此次的销售额为：" +this. getGrossSales() + "\nCommissionRate："
				+ this.getCommissionRate()+"\n\n" ;
	}
	
}
