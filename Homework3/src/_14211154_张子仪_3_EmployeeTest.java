package homework3;
import java.util.*;
public class _14211154_张子仪_3_EmployeeTest {

	public static void main(String[] args) {
		int i;
		String[] Firstname = new String[]{"John","Michelle","Amy","Kim","Mary","David","Sunny","James","Maria","Michael"};
		String[] Lastname=new String[]{"Smith","Jones","Brown","Davis","Miller","Clark","Taylor","Harris","Garcia","Lee"};
		String[] Number = new String[]{"001","002","003","004","005","006","007","008","009","010"};
		 _14211154_张子仪_3_Employee[] data = new  _14211154_张子仪_3_Employee[10]; 
        Random random = new Random();
        Random gloss = new Random();
        Random hour = new Random();
        for(i=0;i<10;i++){
            if(random.nextInt(3) == 0){
            	 data[i] = new   _14211154_张子仪_3_SalaridEmployee(Firstname[i],Lastname[i],Number[i]);
            	 _14211154_张子仪_3_SalaridEmployee Sdata = ( _14211154_张子仪_3_SalaridEmployee)data[i];
            	 Sdata.setWeeklySalary(500);
            	 System.out.println(Sdata.toString());
            	 System.out.println("您的收入为："+String.format("%.2f", Sdata.earning()));
            	 System.out.println("\n");
            }
            else if(random.nextInt(3)==1){
            	  data[i] = new  _14211154_张子仪_3_CommissionEmployee(Firstname[i],Lastname[i],Number[i]);
                  _14211154_张子仪_3_CommissionEmployee Cdata=( _14211154_张子仪_3_CommissionEmployee)data[i];
                  Cdata.setGrossSales(gloss.nextInt(4000));
                  Cdata.setCommissionRate(0.12);
                  System.out.println(Cdata.toString());
                  System.out.println("您的收入为："+String.format("%.2f", Cdata.earning()));  
                  System.out.println("\n");
            }
            else if(random.nextInt(3)==2){
            	data[i]=new  _14211154_张子仪_3_HourlyEmployee(Firstname[i],Lastname[i],Number[i]);
            	_14211154_张子仪_3_HourlyEmployee Hdata = (_14211154_张子仪_3_HourlyEmployee)data[i];
            	Hdata.setWage(20);
            	Hdata.setHours(hour.nextInt(100));
            	System.out.println(Hdata.toString());
                System.out.println("您的收入为："+String.format("%.2f", Hdata.earning()));
                System.out.println("\n");
            }
            else{
            	data[i]=new  _14211154_张子仪_3_BasePlusCommissionEmployee(Firstname[i],Lastname[i],Number[i]);
            	_14211154_张子仪_3_BasePlusCommissionEmployee Bdata = (_14211154_张子仪_3_BasePlusCommissionEmployee)data[i];
                 Bdata.setGrossSales(gloss.nextInt(4000));
                 Bdata.setCommissionRate(0.12);
                 Bdata.setBaseSalary(2500);
                 System.out.println(Bdata.toString());
                 System.out.println("您的收入为："+String.format("%.2f", Bdata.earning()));
                 System.out.println("\n");
            }
        }
	}
}
