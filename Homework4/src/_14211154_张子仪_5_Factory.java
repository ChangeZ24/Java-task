package homework5;
import java.util.*;
public class _14211154_������_5_Factory {
	private HashMap<String,_14211154_������_5_Employee> employee = new HashMap<String,_14211154_������_5_Employee>();

	public HashMap<String, _14211154_������_5_Employee> getemployee() {
		return this.employee;
	}
	public void setemployee(HashMap<String, _14211154_������_5_Employee> employee) {
		this.employee = employee;
	}
	_14211154_������_5_Employee addEmployee(_14211154_������_5_Employee stu){
		if(employee.containsKey(stu.socialSecurityNumber))
			return null;
		else{
			employee.put(stu.socialSecurityNumber, stu);
			return stu;
		}
	}
	void initEmployees(){
		int i;
		String[] Firstname = new String[]{"John","Michelle","Amy","Kim","Mary","David","Sunny","James","Maria","Michael"};
		String[] Lastname=new String[]{"Smith","Jones","Brown","Davis","Miller","Clark","Taylor","Harris","Garcia","Lee"};
		String[] Number = new String[]{"001","002","003","004","005","006","007","008","009","010"};
		_14211154_������_5_Employee data[]=new _14211154_������_5_Employee[10];
		Random random = new Random();
		Random gloss = new Random();
	    Random hour = new Random();
	    for(i=0;i<10;i++){
	        if(random.nextInt(3) == 0){
	        	data[i]= new   _14211154_������_5_SalaridEmployee(Firstname[i],Lastname[i],Number[i]);
	        	 _14211154_������_5_SalaridEmployee Sdata = ( _14211154_������_5_SalaridEmployee)data[i];
	        	 Sdata.setWeeklySalary(500);
	        	 addEmployee(Sdata);
	        }
	        else if(random.nextInt(3)==1){
	        	  data[i] = new  _14211154_������_5_CommissionEmployee(Firstname[i],Lastname[i],Number[i]);
	              _14211154_������_5_CommissionEmployee Cdata=( _14211154_������_5_CommissionEmployee)data[i];
	              Cdata.setGrossSales(gloss.nextInt(4000));
                  Cdata.setCommissionRate(0.12);
	              addEmployee(Cdata);      
	        }
	        else if(random.nextInt(3)==2){
	        	data[i]=new  _14211154_������_5_HourlyEmployee(Firstname[i],Lastname[i],Number[i]);
	        	_14211154_������_5_HourlyEmployee Hdata = (_14211154_������_5_HourlyEmployee)data[i];
	        	Hdata.setWage(20);
            	Hdata.setHours(hour.nextInt(100));
	        	addEmployee(Hdata);
	        }
	        else{
	        	data[i]=new  _14211154_������_5_BasePlusCommissionEmployee(Firstname[i],Lastname[i],Number[i]);
	        	_14211154_������_5_BasePlusCommissionEmployee Bdata = (_14211154_������_5_BasePlusCommissionEmployee)data[i];
	        	Bdata.setGrossSales(gloss.nextInt(4000));
                Bdata.setCommissionRate(0.12);
                Bdata.setBaseSalary(2500);
	        	addEmployee(Bdata);
	        	
	        }
	    }
	}
	_14211154_������_5_Employee deleteEmployee(String empSecNum){
		if(!employee.containsKey(empSecNum))
			return null;
		else{
			_14211154_������_5_Employee e;
			e=employee.get(empSecNum);
			employee.remove(empSecNum);
			return e;
		}
	}
	_14211154_������_5_Employee getEmployee(String empSecNum){
		if(!employee.containsKey(empSecNum))
			return null;
		else
			return this.employee.get(empSecNum);
	}
	_14211154_������_5_Employee updateEmployee(String empSecNum,_14211154_������_5_Employee emp){
		if(!employee.containsKey(empSecNum))
			return null;
		else{
			employee.put(empSecNum, emp);
			return emp;
		}
	}
	void printEmployee(){
		System.out.println(this.employee.values());
	}
/*    public HashMap<String, String> get_14211154_������_4_Employee() {
		return _14211154_������_4_Employee;
	}
	public void set_14211154_������_4_Employee(HashMap<String, String> _14211154_������_4_Employee) {
		this._14211154_������_4_Employee = _14211154_������_4_Employee;
	}*/
	

}
