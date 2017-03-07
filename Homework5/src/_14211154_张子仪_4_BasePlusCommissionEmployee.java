package homework4;

public class _14211154_张子仪_4_BasePlusCommissionEmployee extends _14211154_张子仪_4_CommissionEmployee {
	double baseSalary=2500;
	public double getBaseSalary() {
		return this.baseSalary;
	}
	
	public _14211154_张子仪_4_BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	public _14211154_张子仪_4_BasePlusCommissionEmployee() {
		// TODO Auto-generated constructor stub
	}

	public double earning() {
		// TODO Auto-generated method stub
		return this.grossSales*this.getCommissionRate()+this.getBaseSalary();
	}
	@Override
	public String toString() {
		return  "FirstName：" + this.firstName
				+ "\nlastName：" +this. lastName + "\n socialSecurityNumber：" + this.socialSecurityNumber 
				+ "\n您的工种为：BasePlusCommissionEmployee" +"\n您的月基础工资为：" + this.getBaseSalary()+ "\n您此次的销售额为：" + this.getGrossSales() + "\nCommissionRate："
				+ this.getCommissionRate() ;
	}
}
