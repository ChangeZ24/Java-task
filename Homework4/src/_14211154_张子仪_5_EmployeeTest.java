package homework5;
import java.util.*;
public class _14211154_张子仪_5_EmployeeTest {
	public static void main(String[] args) {
		_14211154_张子仪_5_Factory fa= new _14211154_张子仪_5_Factory();
		int flag=0;
		String num;
		fa.initEmployees();
		while(flag==0){
			System.out.println("*****Menu*****");
			System.out.println("1、Search User");
			System.out.println("2、Delete User");
			System.out.println("3、Update User");
			System.out.println("4、Output All User's Information");
			System.out.println("5、Exit");
			Scanner sc1=new Scanner(System.in);
			int i=sc1.nextInt();
			//sc1.close();
			switch(i){
			case 1:
				Scanner sc  = new Scanner(System.in);
				System.out.println("Please input the security number you want to search:");
				num = sc.nextLine();
				while(!num.equals("0000")){
					if(fa.getEmployee(num)!=null){
						System.out.println(fa.getemployee().get(num));
						System.out.println("Do you want to search again?");
						System.out.println("If you want, please input the security number. If not, please input '0000'");
						num = sc.nextLine();
					}
					else{
						System.out.println("The security number is not existed\n");
						System.out.println("Do you want to search again?\n");
						System.out.println("If you want, please input the security number. If not, please input '0000'");
						num=sc.nextLine();
					}		
				}
				break;
			case 2:
				System.out.println("Please input the user's security number you want to delete:");
				Scanner sc2  = new Scanner(System.in);
				num=sc2.nextLine();
				while(!num.equals("0000")){
					if(fa.getEmployee(num)==null){
						System.out.println("The user is not existed");
						System.out.println("Do you want to delete again?");
						System.out.println("If you want, please input the security number. If not, please input '0000'");
						num=sc2.nextLine();
					}
					else{
						fa.deleteEmployee(num);
						System.out.println("Delete successfully!");
						System.out.println("Do you want to input again?");
						System.out.println("If you want, please input the security number. If not, please input '0000'");
						num=sc2.nextLine();
					}
				}
				break;
			case 3:
				System.out.println("Please input the user's security number you want to update:");
				Scanner sc3  = new Scanner(System.in);
				num=sc3.nextLine();
				while(!num.equals("0000")){
					if(fa.getEmployee(num)==null){
						System.out.println("The user is not existed\n");
						System.out.println("Do you want to input again?\n");
						System.out.println("If you want, please input the security number. If not, please input '0000'");
						num=sc3.nextLine();
					}
					else{
						System.out.println("Please input the user's firstname:");
						String fn=sc3.nextLine();
						System.out.println("Please input the user's lastname:");
						String ln=sc3.nextLine();
						_14211154_张子仪_5_Employee user=fa.getEmployee(num);
						user.setFirstName(fn);
						user.setLastName(ln);
						fa.updateEmployee(num, user);
						System.out.println("Update successfully!");
						System.out.println("Do you want to update again?\n");
						System.out.println("If you want, please input the security number. If not, please input '0000'");
						num=sc3.nextLine();
					}
				}
				break;
			case 4:
				fa.printEmployee();
				break;
			case 5:
				flag=1;
				System.out.println("Thank you for using it.");
				break;
				}			
			}
		}
}
