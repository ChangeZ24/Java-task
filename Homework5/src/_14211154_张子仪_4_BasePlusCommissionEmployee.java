package homework4;

public class _14211154_������_4_BasePlusCommissionEmployee extends _14211154_������_4_CommissionEmployee {
	double baseSalary=2500;
	public double getBaseSalary() {
		return this.baseSalary;
	}
	
	public _14211154_������_4_BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	public _14211154_������_4_BasePlusCommissionEmployee() {
		// TODO Auto-generated constructor stub
	}

	public double earning() {
		// TODO Auto-generated method stub
		return this.grossSales*this.getCommissionRate()+this.getBaseSalary();
	}
	@Override
	public String toString() {
		return  "FirstName��" + this.firstName
				+ "\nlastName��" +this. lastName + "\n socialSecurityNumber��" + this.socialSecurityNumber 
				+ "\n���Ĺ���Ϊ��BasePlusCommissionEmployee" +"\n�����»�������Ϊ��" + this.getBaseSalary()+ "\n���˴ε����۶�Ϊ��" + this.getGrossSales() + "\nCommissionRate��"
				+ this.getCommissionRate() ;
	}
}
