package homework5;

public class _14211154_������_5_BasePlusCommissionEmployee extends _14211154_������_5_CommissionEmployee {
	double baseSalary;
	public double getBaseSalary() {
		return this.baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public _14211154_������_5_BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	public double earning() {
		// TODO Auto-generated method stub
		return this.getGrossSales()*this.getCommissionRate()+this.getBaseSalary();
	}
	@Override
	public String toString() {
		return  "FirstName��" + this.firstName
				+ "\nlastName��" +this. lastName + "\n socialSecurityNumber��" + this.socialSecurityNumber 
				+ "\n���Ĺ���Ϊ��BasePlusCommissionEmployee" +"\n�����»�������Ϊ��" + this.getBaseSalary()+ "\n���˴ε����۶�Ϊ��" + this.getGrossSales() + "\nCommissionRate��"
				+ this.getCommissionRate()+"\n\n";
	}
}
